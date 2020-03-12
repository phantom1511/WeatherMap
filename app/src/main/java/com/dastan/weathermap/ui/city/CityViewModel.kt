package com.dastan.weathermap.ui.city

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dastan.weathermap.model.country.Countries
import com.dastan.weathermap.repositories.CountryRepository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CityViewModel(private  val cRepository:  CountryRepository) : ViewModel(){
    var cities : MutableLiveData<List<Countries>> = MutableLiveData()
    fun getCityInfo(city: String){
        cities = cRepository.getCitiesInfo(city)
    }
}