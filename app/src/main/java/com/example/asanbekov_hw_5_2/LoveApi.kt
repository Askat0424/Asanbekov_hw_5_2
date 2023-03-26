package com.example.asanbekov_hw_5_2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {


    @GET("/getPercentage")
    fun getPercentAge(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key: String = "497568fa95mshd9f14f62e134030p10a47cjsnf8ef70c72111",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"

    ) :Call<LoveModel>
}