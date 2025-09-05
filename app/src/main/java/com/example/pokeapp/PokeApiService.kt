package com.example.pokeapp.data.remote

import com.example.pokeapp.data.model.PokemonResponse
import retrofit2.http.GET

interface PokeApiService {
    @GET("pokemon")
    suspend fun getPokemons(): PokemonResponse
}
