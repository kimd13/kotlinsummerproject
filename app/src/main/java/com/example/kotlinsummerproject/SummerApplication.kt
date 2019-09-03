package com.example.kotlinsummerproject

import android.app.Activity
import android.app.Application
import com.example.kotlinsummerproject.di.ApplicationInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class SummerApplication : Application(), HasActivityInjector {

    @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        ApplicationInjector.init(this)
    }

    override fun activityInjector() = dispatchingActivityInjector
}