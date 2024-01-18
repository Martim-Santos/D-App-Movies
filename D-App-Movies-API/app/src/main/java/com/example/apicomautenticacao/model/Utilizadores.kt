package com.example.apicomautenticacao.model

import com.google.gson.annotations.SerializedName

data class Utilizadores (
    @SerializedName("utilizadores") val utilizador: List<Utilizador>
)
