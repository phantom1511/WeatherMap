package com.dastan.weathermap.ui.city

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dastan.weathermap.model.country.Countries
import com.dastan.weathermap.repositories.CountryRepository

class CityViewModel(private  val cRepository: CountryRepository) : ViewModel(){
    lateinit var liveData: MutableLiveData<List<Countries>>

    fun getCityInfo(city: String) {
        liveData = cRepository.getCitiesInfo(city)
    }
}