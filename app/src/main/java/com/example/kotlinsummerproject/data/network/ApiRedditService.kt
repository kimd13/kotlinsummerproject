package com.example.kotlinsummerproject.data.network

import com.example.kotlinsummerproject.data.network.response.RedditResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiRedditService {

    @GET(".json")
    fun getRedditPage(): Deferred<RedditResponse>

    companion object{
        operator fun invoke(): ApiRedditService {
            //syntax appropriate
            //no need for interceptor

            val okHttpClient = OkHttpClient()
            //http client can be created with interceptors

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://reddit.com/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiRedditService::class.java)
        }
    }

}