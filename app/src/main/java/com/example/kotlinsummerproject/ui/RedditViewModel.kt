package com.example.kotlinsummerproject.ui

import androidx.lifecycle.ViewModel
import com.example.kotlinsummerproject.data.api.ApiRepository
import com.example.kotlinsummerproject.data.network.response.RedditResponse

class RedditViewModel(private val apiRepository: ApiRepository): ViewModel(){

    fun getPosts() = apiRepository.getPosts()

    fun addPost(post: RedditResponse) = apiRepository.addPost(post)

}