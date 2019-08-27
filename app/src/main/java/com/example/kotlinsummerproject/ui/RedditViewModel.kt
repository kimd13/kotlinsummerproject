package com.example.kotlinsummerproject.ui

import androidx.lifecycle.ViewModel
import com.example.kotlinsummerproject.data.api.ApiRepository
import com.example.kotlinsummerproject.data.models.RedditPostModel

class RedditViewModel(private val apiRepository: ApiRepository): ViewModel(){

    fun getPosts() = apiRepository.getPosts()

    fun addPost(post: RedditPostModel) = apiRepository.addPost(post)

}