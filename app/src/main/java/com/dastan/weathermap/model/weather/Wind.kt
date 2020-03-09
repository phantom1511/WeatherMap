package com.dastan.weathermap.model.weather

import com.google.gson.annotations.SerializedName

data class Wind(
    @SerializedName("speed")
    val speed: Double? = 0.0,
    @SerializedName("deg")
    val deg: Int? = 0
)