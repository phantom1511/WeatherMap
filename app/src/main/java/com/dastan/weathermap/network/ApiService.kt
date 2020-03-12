package com.dastan.weathermap.network
import com.dastan.weathermap.model.country.Countries
import com.dastan.weathermap.model.weather.WeatherMainModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import io.reactivex.Observable

interface ApiService {
    @GET("data/2.5/weather")
    fun getWeatherData(@Query("units") units: String,
                       @Query("lat") lat: String,
                       @Query("lon") lon: String,
                       @Query("appId") appId: String) : Call<WeatherMainModel>

    @GET("rest/v2/capital/{capital}")
    fun getCityInfo(@Path("capital") capital: String) : Call<List<Countries>>
}