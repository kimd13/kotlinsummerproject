package com.example.kotlinsummerproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinsummerproject.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initUi()
    }

    //private fun initUi(){
        //val factory = RedditDepenpencyInjector.produceRedditViewModelFactory()
        //val viewModel = ViewModelProvider(this, factory)
          //  .get(RedditViewModel::class.java)
    //}
}
