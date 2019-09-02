package com.example.kotlinsummerproject.data.network

import androidx.lifecycle.LiveData
import com.example.kotlinsummerproject.data.network.response.RedditResponse

interface RedditNetworkDataSrc {

    val downloadedRedditResponse: LiveData<RedditResponse>

    suspend fun fetchRedditResponse()

}