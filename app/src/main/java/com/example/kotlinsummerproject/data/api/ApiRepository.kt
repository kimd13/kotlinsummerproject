package com.example.kotlinsummerproject.data.api

import com.example.kotlinsummerproject.data.network.response.RedditResponse

class ApiRepository private constructor(private val dao: ApiDao){

    fun addPost(post: RedditResponse){
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