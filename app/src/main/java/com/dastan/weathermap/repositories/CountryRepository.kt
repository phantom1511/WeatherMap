package com.dastan.weathermap.repositories

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.dastan.weathermap.model.country.Countries
import com.dastan.weathermap.network.ApiService
import com.dastan.weathermap.network.RetrofitClient
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private const val BASE_URL = "https://restcountries.eu/"

class CountryRepository {
    private lateinit var api: ApiService
    fun getCitiesInfo(city: String): Observable<List<Countries>> {
        api = RetrofitClient.instateRetrofit(BASE_URL)!!
        return api.getCityInfo(city)
    }
}