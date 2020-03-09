package com.dastan.weathermap.di

import com.dastan.weathermap.network.RetrofitClient
import com.dastan.weathermap.repositories.CountryRepository
import com.dastan.weathermap.repositories.WeatherRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single {
        RetrofitClient()
    }

    single {
        WeatherRepository()
    }
    single {
        CountryRepository()
    }

    viewModel {
        MapViewModel(get())
    }
    viewModel {
        CityViewModel(get())
    }

}