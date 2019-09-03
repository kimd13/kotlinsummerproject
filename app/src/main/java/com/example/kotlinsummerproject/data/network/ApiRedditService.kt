package com.example.kotlinsummerproject.data.network

import com.example.kotlinsummerproject.data.network.response.RedditResponse
import io.reactivex.Single
import retrofit2.http.GET

interface ApiRedditService {

    //The ApiRedditService Interface is in charge of api calls and the deserialization of the results

    @GET(".json")
    fun getRedditPage(): Single<RedditResponse>
}