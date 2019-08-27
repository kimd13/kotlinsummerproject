package com.example.kotlinsummerproject.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinsummerproject.data.api.ApiRepository

class RedditViewModelFactory (private val apiRepository: ApiRepository)
    : ViewModelProvider.NewInstanceFactory(){

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RedditViewModel(apiRepository) as T
    }

}