package com.example.currencyconverter.Data

import com.example.currencyconverter.Data.models.CurrencyResponse
import okhttp3.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest")
    suspend fun getRates(
        @Query("base") base: String
    ): retrofit2.Response<CurrencyResponse>

}