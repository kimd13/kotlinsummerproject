package com.example.kotlinsummerproject.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinsummerproject.data.network.response.RedditResponse
import com.example.kotlinsummerproject.internal.NoConnectivityException

class RedditNetworkDataSrcImpl (
    private val apiRedditService: ApiRedditService
) : RedditNetworkDataSrc {

    //The reddit network data src is a layer of implementation above the api reddit service
    //It is in charge of keeping track of live data which is only modifiable within this class

    private val _downloadedRedditResponse = MutableLiveData<RedditResponse>()
    override val downloadedRedditResponse: LiveData<RedditResponse>
        get() = _downloadedRedditResponse

    override suspend fun fetchRedditResponse() {

        //fetchRedditResponse does a call to the api and modifies the MUTABLE version of the live data

        try{
            val fetchedRedditPage = apiRedditService
                .getRedditPage()
                .await()
            _downloadedRedditResponse.postValue(fetchedRedditPage)
        }
        catch(e : NoConnectivityException){
            Log.e("Connectivity", "No Internet connection...", e)
        }
    }
}