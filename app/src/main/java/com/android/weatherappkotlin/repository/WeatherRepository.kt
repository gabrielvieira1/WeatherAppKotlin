package com.android.weatherappkotlin.repository

import com.android.weatherappkotlin.server.ApiServices

class WeatherRepository(val api: ApiServices) {
    fun getCurrentWeather(lat: Double, lon: Double, unit: String) =
        api.getCurrentWeather(lat, lon, unit, "4ec1896d987fb101424fd7ab5547944d")

    fun getForecastWeather(lat: Double, lon: Double, unit: String) =
        api.getForecastWeather(lat, lon, unit, "4ec1896d987fb101424fd7ab5547944d")
}