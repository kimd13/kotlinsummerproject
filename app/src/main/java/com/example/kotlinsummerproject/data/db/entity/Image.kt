package com.example.kotlinsummerproject.data.db.entity


data class Image(
    val id: String = "",
    val resolutions: List<Resolution> = listOf(),
    val source: Source = Source(),
    val variants: Variants = Variants()
)