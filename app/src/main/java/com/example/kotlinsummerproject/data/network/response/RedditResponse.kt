package com.example.kotlinsummerproject.data.network.response


import com.example.kotlinsummerproject.data.db.entity.Data

data class RedditResponse(

    //RedditResponse is the format class in which the json api package will come as
    //Deserialization of values non-present are ignored, we only need data

    val `data`: Data = Data()
    //val kind: String = ""
)