package com.example.apicomautenticacao.service

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.example.apicomautenticacao.service.ImageService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val gson: Gson = GsonBuilder().setLenient().create()

    private val retrofit = Retrofit.Builder()
        //.baseUrl("http://10.0.2.2/")
        .baseUrl("https://api.sheety.co/44999724e36c8f60a4a0444b7f325fbd/project/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun imageService() = retrofit.create(ImageService::class.java)
}