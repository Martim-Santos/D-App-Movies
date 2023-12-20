package com.example.apicomautenticacao.model

import com.google.gson.annotations.SerializedName

import android.media.Image

data class Fotos (
    @SerializedName("fotos") val fotos: List<Foto>
)




