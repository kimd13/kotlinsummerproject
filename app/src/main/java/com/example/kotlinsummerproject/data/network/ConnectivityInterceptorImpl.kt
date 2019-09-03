package com.example.kotlinsummerproject.data.network

import android.content.Context
import android.net.ConnectivityManager
import androidx.annotation.VisibleForTesting
import com.example.kotlinsummerproject.internal.NoConnectivityException
import okhttp3.Interceptor
import okhttp3.Response

class ConnectivityInterceptorImpl(context: Context) : Interceptor {

    //The connectivity interceptor checks for whether the app is online or not
    //It throws a custom exception in the case where the app is offline

    private val appContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isOnline()) {
            throw NoConnectivityException()
        }
        return chain.proceed(chain.request())
    }

    @VisibleForTesting fun isOnline(): Boolean {
        val connectivityManager = appContext.getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager

        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

}