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
    fun getCitiesInfo(city: String): MutableLiveData<List<Countries>> {
        api = RetrofitClient.instateRetrofit(BASE_URL)!!
        val data = MutableLiveData<List<Countries>>()
        api.getCityInfo(city).enqueue(object : Callback<List<Countries>>{
            override fun onFailure(call: Call<List<Countries>>, t: Throwable) {
                data.value = null
            }

            override fun onResponse(
                call: Call<List<Countries>>,
                response: Response<List<Countries>>
            ) {
                data.value = response.body()
            }

        })
        return data
    }
}