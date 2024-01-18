package com.example.apicomautenticacao.model

import com.google.gson.annotations.SerializedName

data class Utilizador(
    @SerializedName("nome") val nome: String,
    @SerializedName("foto") val pass: String,
    @SerializedName("data") val mail: String,
    @SerializedName("data") val fotos: List<Foto> ,
    @SerializedName("id") val id: Int
)
