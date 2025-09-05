package com.example.pokeapp.data.repository

import com.example.pokeapp.data.model.Pokemon
import com.example.pokeapp.data.remote.RetrofitInstance


class PokemonRepository {
    suspend fun getPokemons(): List<Pokemon> {
        return RetrofitInstance.api.getPokemons().results
    }
}
