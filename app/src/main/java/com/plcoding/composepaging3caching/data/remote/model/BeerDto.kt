package com.plcoding.composepaging3caching.data.remote.model

data class BeerDto(
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