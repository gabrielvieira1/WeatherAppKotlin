package com.android.weatherappkotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.android.weatherappkotlin.repository.WeatherRepository
import com.android.weatherappkotlin.server.ApiClient
import com.android.weatherappkotlin.server.ApiServices

class WeatherViewModel(val repository: WeatherRepository) : ViewModel() {

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double, lon: Double, unit: String) =
        repository.getCurrentWeather(lat, lon, unit)

    fun loadForecastWeather(lat: Double, lon: Double, unit: String) =
        repository.getForecastWeather(lat, lon, unit)
}