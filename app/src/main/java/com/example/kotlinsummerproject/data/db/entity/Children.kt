package com.example.kotlinsummerproject.data.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reddit_posts")
//Using the Room library; we cache the table of posts

data class Children(
    @Embedded(prefix = "post_")
    //reddit_posts table will have cols = post_author, post_title
    val `data`: DataX = DataX()
    //val kind: String = ""
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}