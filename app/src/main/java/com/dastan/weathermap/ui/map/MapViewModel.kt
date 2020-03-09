package com.dastan.weathermap.ui.map

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dastan.weathermap.model.weather.WeatherMainModel
import com.dastan.weathermap.repositories.WeatherRepository

class MapViewModel(private val wRepository: WeatherRepository) : ViewModel() {
    lateinit var liveData: MutableLiveData<WeatherMainModel>
    fun getWeatherData(units: String, lat: String, lon: String){
        liveData = wRepository.getWeatherData(units, lat, lon)
    }
}