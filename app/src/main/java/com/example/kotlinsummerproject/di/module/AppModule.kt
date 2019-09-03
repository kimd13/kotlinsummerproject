package com.example.kotlinsummerproject.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application.applicationContext
}