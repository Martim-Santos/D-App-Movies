package com.example.apicomautenticacao.Autenticacao

import com.example.apicomautenticacao.model.APIResult
import com.example.apicomautenticacao.model.Fotos
import com.example.apicomautenticacao.model.Utilizadores
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface RegisterService {

    @GET("utilizadores")
    fun list(): Call<Utilizadores>

    @FormUrlEncoded
    @POST("utilizadores")
    fun addUtilizador(@Field("nome") nome: String?,
                @Field("pass") pass: String? ,
                @Field("mail") mail: String?,
                @Field("fotos") fotos: List<Fotos>
    ): Call<APIResult>
}