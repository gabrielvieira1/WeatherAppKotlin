package com.android.weatherappkotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.android.weatherappkotlin.repository.CityRepository
import com.android.weatherappkotlin.server.ApiClient
import com.android.weatherappkotlin.server.ApiServices

class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor() : this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) =
        repository.getCities(q, limit)
}