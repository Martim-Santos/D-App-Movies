package com.example.apicomautenticacao.model

import retrofit2.Call
import retrofit2.http.GET

class APIFotos {

    interface FotoService {
        @GET("https://api.sheety.co/44999724e36c8f60a4a0444b7f325fbd/project/fotos")
        fun list(): Call<List<Fotografias>>
    }
}


