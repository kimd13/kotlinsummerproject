package com.example.kotlinsummerproject.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kotlinsummerproject.data.db.postmodel.RedditPostModel

@Database(
    entities = [RedditPostModel::class],
    version = 1
)
abstract class RedditPostDatabase: RoomDatabase(){
    abstract fun redditPostDao(): RedditPostDao

    companion object{
        @Volatile private var instance: RedditPostDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance ?: buildDatabase(context).also{ instance = it}
        }

        private fun buildDatabase (context: Context)=
            Room.databaseBuilder(context.applicationContext,
                RedditPostDatabase::class.java, "reddit.db")
                .build()

    }
}