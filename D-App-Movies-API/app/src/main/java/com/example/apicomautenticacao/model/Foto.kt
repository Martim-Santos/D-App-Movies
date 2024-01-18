package com.example.apicomautenticacao.model

import com.google.gson.annotations.SerializedName

import android.media.Image

data class Foto (
    @SerializedName("nome") val nome: String,
    @SerializedName("foto") val foto: String,
    @SerializedName("data") val data: String,
    @SerializedName("id") val id: Int
)




