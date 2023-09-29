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
    val abv: Double?,
    val attenuation_level: Double?,
//    @Embedded
//    val boil_volume: BoilVolume,
    val brewers_tips: String?,
    val contributed_by: String?,
    val description: String?,
    val ebc: Double?,
    val first_brewed: String?,
//    val food_pairing: List<String>,
    val ibu: Float?,
    val image_url: String?,
//    @Embedded
//    val ingredients: Ingredients,
//    @Embedded
//    val method: Method,
    val name: String?,
    val ph: Double?,
    val srm: Double,
    val tagline: String?,
    val target_fg: Double?,
    val target_og: Float?,
//    @Embedded
//    val volume: Volume
)
