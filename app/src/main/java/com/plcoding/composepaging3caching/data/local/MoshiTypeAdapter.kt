package com.plcoding.composepaging3caching.data.local

import com.plcoding.composepaging3caching.data.remote.model.BoilVolume
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.io.IOException

class StringListAdapter : JsonAdapter<List<String>>() {
    override fun fromJson(reader: JsonReader): List<String>? {
        if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull<Unit>()
            return null
        }
        val list = mutableListOf<String>()
        reader.beginArray()
        while (reader.hasNext()) {
            list.add(reader.nextString())
        }
        reader.endArray()
        return list
    }

    override fun toJson(writer: JsonWriter, value: List<String>?) {
        if (value == null) {
            writer.nullValue()
            return
        }
        writer.beginArray()
        for (item in value) {
            writer.value(item)
        }
        writer.endArray()
    }
}

class BoilVolumeTypeAdapter : JsonAdapter<BoilVolume>() {

    @Throws(IOException::class)
    override fun fromJson(reader: JsonReader): BoilVolume? {
        reader.beginObject()

        var unit = ""
        var value = 0

        while (reader.hasNext()) {
            when (reader.nextName()) {
                "unit" -> unit = reader.nextString()
                "value" -> value = reader.nextInt()
                else -> reader.skipValue()
            }
        }

        reader.endObject()
        return BoilVolume(unit, value)
    }

    override fun toJson(writer: JsonWriter, value: BoilVolume?) {
        writer.beginObject()
        value?.let {
            writer.name("unit").value(it.unit)
            writer.name("value").value(it.value)
        }
        writer.endObject()
    }
}