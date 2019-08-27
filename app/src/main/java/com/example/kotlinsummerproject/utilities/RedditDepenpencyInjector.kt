package com.example.kotlinsummerproject.utilities

import com.example.kotlinsummerproject.data.api.ApiDao
import com.example.kotlinsummerproject.data.api.ApiRepository
import com.example.kotlinsummerproject.ui.RedditViewModelFactory

object RedditDepenpencyInjector {

    fun produceRedditViewModelFactory(): RedditViewModelFactory{
        val apiRepo = ApiRepository.getInstance(ApiDao())
        return RedditViewModelFactory(apiRepo)
    }

}