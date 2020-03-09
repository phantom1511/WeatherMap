package com.dastan.weathermap.model.weather

import com.google.gson.annotations.SerializedName

data class WeatherMainModel(
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("base")
    val base: String,
    @SerializedName("main")
    val main: Main?,
    @SerializedName("wind")
    val wind: Wind,
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("dt")
    val dt: Int?,
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone:Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("code")
    val code: Int?
)