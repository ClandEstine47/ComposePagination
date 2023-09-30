package com.plcoding.composepaging3caching.data.local

import androidx.room.TypeConverter
import com.plcoding.composepaging3caching.data.remote.model.BoilVolume
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.reflect.Type

class Converters {

    private val moshi: Moshi = Moshi.Builder().build()

    @TypeConverter
    fun fromStringList(value: String): List<String>? {
        val type: Type = Types.newParameterizedType(List::class.java, String::class.java)
        val adapter: JsonAdapter<List<String>> = moshi.adapter(type)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun toStringList(list: List<String>?): String {
        val type: Type = Types.newParameterizedType(List::class.java, String::class.java)
        val adapter: JsonAdapter<List<String>> = moshi.adapter(type)
        return adapter.toJson(list)
    }

    @TypeConverter
    fun fromBoilVolume(value: String): BoilVolume? {
        val type = Types.newParameterizedType(BoilVolume::class.java)
        val adapter: JsonAdapter<BoilVolume> = moshi.adapter(type)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun toBoilVolume(value: BoilVolume?): String {
        val type = Types.newParameterizedType(BoilVolume::class.java)
        val adapter: JsonAdapter<BoilVolume> = moshi.adapter(type)
        return adapter.toJson(value)
    }

}