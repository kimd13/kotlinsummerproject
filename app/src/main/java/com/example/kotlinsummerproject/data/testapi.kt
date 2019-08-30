package com.example.kotlinsummerproject.data

import androidx.room.Room
import com.example.kotlinsummerproject.data.db.RedditPostDatabase
import com.example.kotlinsummerproject.data.network.ApiRedditService
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>){
    runBlocking {
        println("hero")
        val service: ApiRedditService =
            ApiRedditService()
        val res = service.getRedditPage().await()
        println(res)
        val db = RedditPostDatabase(this)

    }
}