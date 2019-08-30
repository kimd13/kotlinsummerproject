package com.example.kotlinsummerproject.data.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinsummerproject.data.network.response.RedditResponse

class ApiDao {
    private val postList = mutableListOf<RedditResponse>()
    private val posts = MutableLiveData<List<RedditResponse>>()

    init{
        posts.value = postList
    }

    fun addPost(post: RedditResponse){
        postList.add(post)
        posts.value = postList
    }

    fun getPosts() = posts as LiveData<List<RedditResponse>>

}