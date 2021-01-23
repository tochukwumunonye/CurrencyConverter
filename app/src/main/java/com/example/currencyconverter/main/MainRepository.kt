package com.example.currencyconverter.main

import com.example.currencyconverter.Data.models.CurrencyResponse
import com.example.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>


}