package com.example.kotlinsummerproject.data.api

import com.example.kotlinsummerproject.data.models.RedditPostModel

class ApiRepository private constructor(private val dao: ApiDao){

    fun addPost(post: RedditPostModel){
        dao.addPost(post)
    }

    fun getPosts() = dao.getPosts()

    companion object{
        @Volatile private var instance: ApiRepository? = null

        fun getInstance(dao: ApiDao) =
            instance ?: synchronized(this){
                instance ?: ApiRepository(dao).also { instance = it }
            }
    }

}