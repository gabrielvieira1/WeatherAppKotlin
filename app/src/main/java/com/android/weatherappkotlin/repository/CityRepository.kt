package com.android.weatherappkotlin.repository

import com.android.weatherappkotlin.server.ApiServices

class CityRepository(val api: ApiServices) {

    fun getCities(q: String, limit: Int) =
        api.getCitiesList(q, limit, "4ec1896d987fb101424fd7ab5547944d")
}