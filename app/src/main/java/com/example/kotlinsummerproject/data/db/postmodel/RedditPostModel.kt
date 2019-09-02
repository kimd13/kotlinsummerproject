package com.example.kotlinsummerproject.data.db.postmodel

import androidx.room.ColumnInfo

data class RedditPostModel(
    //this data class is the model of object we will utilize
    @ColumnInfo(name = "post_author")
    val author: String,
    @ColumnInfo(name = "post_title")
    val title: String
)