package com.example.kotlinsummerproject.data.db.postmodel

import androidx.room.ColumnInfo

data class RedditPostModel(
    @ColumnInfo(name = "post_author")
    val author: String,
    @ColumnInfo(name = "post_title")
    val title: String
)