package com.plcoding.composepaging3caching.data.local

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.composepaging3caching.data.remote.model.BoilVolume
import com.plcoding.composepaging3caching.data.remote.model.Ingredients
import com.plcoding.composepaging3caching.data.remote.model.Method
import com.plcoding.composepaging3caching.data.remote.model.Volume

@Entity
data class BeerEntity(
    @PrimaryKey
    val id: Int,
    val abv: Double,
    val attenuation_level: Int,
//    @Embedded
//    val boil_volume: BoilVolume,
    val brewers_tips: String,
    val contributed_by: String,
    val description: String,
    val ebc: Int,
    val first_brewed: String,
    val food_pairing: List<String>,
    val ibu: Int,
    val image_url: String?,
//    @Embedded
//    val ingredients: Ingredients,
//    @Embedded
//    val method: Method,
    val name: String,
    val ph: Double,
    val srm: Int,
    val tagline: String,
    val target_fg: Int,
    val target_og: Int,
//    @Embedded
//    val volume: Volume
)
