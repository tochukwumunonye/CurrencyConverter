package com.example.currencyconverter.Data.models

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates,

)