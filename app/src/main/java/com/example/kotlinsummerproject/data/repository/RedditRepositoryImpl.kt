package com.example.kotlinsummerproject.data.repository

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinsummerproject.data.db.RedditPostDao
import com.example.kotlinsummerproject.data.db.postmodel.RedditPostModel
import com.example.kotlinsummerproject.data.network.RedditNetworkDataSrc
import com.example.kotlinsummerproject.data.network.response.RedditResponse
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.threeten.bp.ZonedDateTime
import javax.inject.Inject

class RedditRepositoryImpl @Inject constructor(
    private val redditNetworkDataSrc: RedditNetworkDataSrc,
    override val redditPosts: MutableLiveData<RedditResponse> = MutableLiveData()
    ) : RedditRepository {


    @SuppressLint("CheckResult")
    override fun getRedditPost() {
        redditNetworkDataSrc.fetchRedditResponse()
            .subscribeOn(Schedulers.io())
            .subscribe(
                {response ->
                    redditPosts.postValue(response)
                },
                {error ->
                }
            )
    }
    //initializes to always need a first fetch
    //var lastFetched = ZonedDateTime.now().minusHours(1)




    /*
    init{
        redditNetworkDataSrc.downloadedRedditResponse.observeForever{ newRedditResponse ->
            persistFetchedRedditResponse(newRedditResponse)
        }
    }

    override fun getRedditPost(): LiveData<RedditPostModel> {
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

    */
}