package com.example.apicomautenticacao.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class APIResult(
    @SerializedName("foto") val codigo: String?,
    @SerializedName("nome") val nome: String?,
    @SerializedName("data") val date: Date
)

