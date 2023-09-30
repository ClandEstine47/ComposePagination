package com.plcoding.composepaging3caching.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [BeerEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class BeerDatabase: RoomDatabase() {

    abstract val dao: BeerDao

}