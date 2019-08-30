package com.example.kotlinsummerproject.data.network.response


import com.example.kotlinsummerproject.data.db.entity.Data

data class RedditResponse(
    val `data`: Data = Data()
    //val kind: String = ""
)