package com.example.kotlinsummerproject.data.models

data class RedditPostModel (val author: String, val description: String){
    override fun toString(): String {
        return "$description\n-$author"
    }
}