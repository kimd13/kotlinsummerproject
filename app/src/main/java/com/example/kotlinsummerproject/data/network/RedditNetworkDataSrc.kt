package com.example.kotlinsummerproject.data.network

import com.example.kotlinsummerproject.data.network.response.RedditResponse
import io.reactivex.Single

interface RedditNetworkDataSrc {

    fun fetchRedditResponse(): Single<RedditResponse>
}