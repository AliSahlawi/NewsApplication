package com.androiddevs.mvvmnewsapp.myApp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.myApp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) : String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String) : Source {
        return Source(name,name)
    }

}