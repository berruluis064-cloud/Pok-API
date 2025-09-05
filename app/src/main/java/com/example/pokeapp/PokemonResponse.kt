package com.example.pokeapp.data.model

data class PokemonResponse(
    val count: Int,
    val results: List<Pokemon>
)

data class Pokemon(
    val name: String,
    val url: String
)

