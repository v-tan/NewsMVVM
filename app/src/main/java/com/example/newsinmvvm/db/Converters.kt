package com.example.newsinmvvm.db

import androidx.room.TypeConverter
import com.example.newsinmvvm.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String = source.name

    @TypeConverter
    fun toSource(name: String): Source = Source(name, name)
}