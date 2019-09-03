package com.example.kotlinsummerproject.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinsummerproject.data.db.postmodel.RedditPostModel
import com.example.kotlinsummerproject.data.network.response.RedditResponse

interface RedditRepository {
    val redditPosts: MutableLiveData<RedditResponse>
    fun getRedditPost()
}