package com.example.apicomautenticacao.service

import com.example.apicomautenticacao.model.APIResult
import com.example.apicomautenticacao.model.Foto
import com.example.apicomautenticacao.model.Fotos
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import java.util.Date

interface ImageService {

    @GET("fotos")
    fun list(): Call<Fotos>

    @FormUrlEncoded
    @POST("fotos")
    fun addFoto(@Field("foto") codigo: String?,
                @Field("nome") nome: String?,
                @Field("data") date: Date ): Call<APIResult>
}