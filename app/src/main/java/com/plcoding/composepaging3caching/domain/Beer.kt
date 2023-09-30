package com.plcoding.composepaging3caching.domain

import com.plcoding.composepaging3caching.data.remote.model.BoilVolume
import com.plcoding.composepaging3caching.data.remote.model.Ingredients
import com.plcoding.composepaging3caching.data.remote.model.Method
import com.plcoding.composepaging3caching.data.remote.model.Volume

data class Beer(
    val abv: Double?,
    val attenuation_level: Double?,
    val boil_volume: BoilVolume,
    val brewers_tips: String?,
    val contributed_by: String?,
    val description: String?,
    val ebc: Double?,
    val first_brewed: String?,
    val food_pairing: List<String>,
    val ibu: Float?,
    val id: Int,
    val image_url: String?,
//    val ingredients: Ingredients,
//    val method: Method,
    val name: String?,
    val ph: Double?,
    val srm: Double?,
    val tagline: String?,
    val target_fg: Double?,
    val target_og: Float?,
//    val volume: Volume
)
