package com.example.kotlinsummerproject.data.repository

import androidx.lifecycle.LiveData
import com.example.kotlinsummerproject.data.db.postmodel.RedditPostModel

interface RedditRepository {
    suspend fun getRedditPost() : LiveData<RedditPostModel>
}