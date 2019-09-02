package com.example.kotlinsummerproject.data.repository

import androidx.lifecycle.LiveData
import com.example.kotlinsummerproject.data.db.RedditPostDao
import com.example.kotlinsummerproject.data.db.postmodel.RedditPostModel
import com.example.kotlinsummerproject.data.network.RedditNetworkDataSrc
import com.example.kotlinsummerproject.data.network.response.RedditResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.threeten.bp.ZonedDateTime

class RedditRepositoryImpl (
    private val redditPostDao: RedditPostDao,
    private val redditNetworkDataSrc: RedditNetworkDataSrc
) : RedditRepository {

    var lastFetched = ZonedDateTime.now().minusHours(1)
    //initializes to always need a first fetch

    init{
        redditNetworkDataSrc.downloadedRedditResponse.observeForever{ newRedditResponse ->
            persistFetchedRedditResponse(newRedditResponse)
        }
    }

    override suspend fun getRedditPost(): LiveData<RedditPostModel> {
        initRedditData()
        return withContext(Dispatchers.IO){
            return@withContext redditPostDao.getTenPosts()
        }
    }

    private fun persistFetchedRedditResponse(fetchedRedditResponse: RedditResponse){
        GlobalScope.launch(Dispatchers.IO) {
            for (child in fetchedRedditResponse.data.children){
                redditPostDao.upsert(child)
            }
        }
    }

    private suspend fun  initRedditData(){
        if (isFetchNeeded(lastFetched)){
            fetchRedditResponse()
        }
    }

    private suspend fun fetchRedditResponse(){
        //this function update the live data, thus does not need to return
        redditNetworkDataSrc.fetchRedditResponse()
    }


    private fun isFetchNeeded(lastFetchTime: ZonedDateTime): Boolean{
        val halfHourAgo = ZonedDateTime.now().minusMinutes(30)
        return lastFetchTime.isBefore(halfHourAgo)
    }


}