package com.example.kotlinsummerproject.di.module

import android.content.Context
import com.example.kotlinsummerproject.data.network.ApiRedditService
import com.example.kotlinsummerproject.data.network.ConnectivityInterceptorImpl
import com.example.kotlinsummerproject.data.network.RedditNetworkDataSrc
import com.example.kotlinsummerproject.data.network.RedditNetworkDataSrcImpl
import com.example.kotlinsummerproject.data.repository.RedditRepository
import com.example.kotlinsummerproject.data.repository.RedditRepositoryImpl
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideOkHttp(context: Context) = OkHttpClient.Builder()
        .addInterceptor(ConnectivityInterceptorImpl(context = context))
        .build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl("http://reddit.com/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun provideApiReddit(retrofit: Retrofit) =
        retrofit.create(ApiRedditService::class.java)

    @Provides
    @Singleton
    fun provideDataSrcImplementation(apiRedditService: ApiRedditService): RedditNetworkDataSrc = RedditNetworkDataSrcImpl(apiRedditService)

    @Provides
    @Singleton
    fun provideRepository(redditNetworkDataSrc: RedditNetworkDataSrc): RedditRepository = RedditRepositoryImpl(redditNetworkDataSrc)

}