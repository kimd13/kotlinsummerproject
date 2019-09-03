package com.example.kotlinsummerproject.data.network

import android.annotation.SuppressLint
import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinsummerproject.data.network.response.RedditResponse
import com.example.kotlinsummerproject.internal.NoConnectivityException
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RedditNetworkDataSrcImpl @Inject constructor(
    @VisibleForTesting val apiRedditService: ApiRedditService
) : RedditNetworkDataSrc {


    @SuppressLint("CheckResult")
    override fun fetchRedditResponse() = apiRedditService.getRedditPage()
}