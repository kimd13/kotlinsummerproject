package com.example.kotlinsummerproject.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.kotlinsummerproject.data.db.entity.Children
import com.example.kotlinsummerproject.data.db.postmodel.RedditPostModel

@Dao
interface RedditPostDao {

    @Insert
    fun upsert(redditPost: Children)

    @Query("SELECT * FROM reddit_posts LIMIT 5")
    fun getFivePosts(): LiveData<RedditPostModel>

    @Query("SELECT * FROM reddit_posts LIMIT 10")
    fun getTenPosts(): LiveData<RedditPostModel>

}