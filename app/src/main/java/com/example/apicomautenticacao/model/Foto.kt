package com.example.apicomautenticacao.model


import com.google.gson.annotations.SerializedName

import android.media.Image
data class Foto (
    @SerializedName("nome") val nome: String?,
    @SerializedName("imagem") val imagem: Image?)

