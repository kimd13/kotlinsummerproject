package com.example.kotlinsummerproject.di.component

import android.app.Application
import com.example.kotlinsummerproject.SummerApplication
import com.example.kotlinsummerproject.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class
    ]
)
interface AppComponent {

    fun inject(summerApplication: SummerApplication)

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }
}