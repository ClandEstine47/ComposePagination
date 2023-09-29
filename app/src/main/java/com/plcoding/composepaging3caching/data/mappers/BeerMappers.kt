package com.plcoding.composepaging3caching.data.mappers

import com.plcoding.composepaging3caching.data.local.BeerEntity
import com.plcoding.composepaging3caching.data.remote.model.BeerDto
import com.plcoding.composepaging3caching.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        abv = abv,
        attenuation_level = attenuation_level,
        brewers_tips = brewers_tips,
        contributed_by = contributed_by,
        description = description,
        ebc = ebc,
        first_brewed = first_brewed,
//        food_pairing = food_pairing,
        ibu = ibu,
        image_url = image_url,
        name = name,
        ph = ph,
        srm = srm ?: 0.0,
        tagline = tagline,
        target_fg = target_fg,
        target_og = target_og
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        abv = abv,
        attenuation_level = attenuation_level,
        brewers_tips = brewers_tips,
        contributed_by = contributed_by,
        description = description,
        ebc = ebc,
        first_brewed = first_brewed,
//        food_pairing = food_pairing,
        ibu = ibu,
        image_url = image_url,
        name = name,
        ph = ph,
        srm = srm,
        tagline = tagline,
        target_fg = target_fg,
        target_og = target_og
    )
}