package com.example.kotlinsummerproject.data.db.entity


data class Preview(
    val enabled: Boolean = false,
    val images: List<Image> = listOf()
)