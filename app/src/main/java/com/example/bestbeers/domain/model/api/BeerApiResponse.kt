package com.example.bestbeers.domain.model.api

data class BeerApiResponse(
    val id: Int,
    val name: String,
    val tagline: String,
    val first_brewed: String,
    val description: String,
    val image_url: String,
    val abv: Double,
    val ibu: Double,
    val target_fg: Int,
    val target_og: Double,
    val ebc: Int,
    val srm: Double,
    val ph: Double,
    val attenuation_level: Double,
    val volume: Volume,
    val boil_volume: BoilVolume,
    val method: Method,
    val ingredients: Ingredients,
    val food_pairing: List<String>,
    val brewers_tips: String,
    val contributed_by: String,
)

data class Volume(
    val value: Int,
    val unit: String,
)

data class BoilVolume(
    val value: Int,
    val unit: String,
)

data class Method(
    val mash_temp: List<MashTemp>,
    val fermentation: Fermentation,
    val twist: String
)

data class MashTemp(
    val temp: Temp,
    val duration: Int,
)

data class Fermentation(
    val temp: Temp
)

data class Temp(
    val value: Int,
    val unit: String,
)

data class Ingredients(
    val malt: List<Malt>,
    val hops: List<Hop>,
    val yeast: String
)

data class Malt(
    val name: String,
    val amount: Amount,
)

data class Amount(
    val value: Double,
    val unit: String,
)

data class Hop(
    val name: String,
    val amount: Amount,
    val add: String,
    val attribute: String,
)