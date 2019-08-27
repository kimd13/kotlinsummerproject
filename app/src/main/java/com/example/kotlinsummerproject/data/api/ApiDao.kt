package com.example.kotlinsummerproject.data.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinsummerproject.data.models.RedditPostModel

class ApiDao {
    private val postList = mutableListOf<RedditPostModel>()
    private val posts = MutableLiveData<List<RedditPostModel>>()

    init{
        posts.value = postList
    }

    fun addPost(post: RedditPostModel){
        postList.add(post)
        posts.value = postList
    }

    fun getPosts() = posts as LiveData<List<RedditPostModel>>

}