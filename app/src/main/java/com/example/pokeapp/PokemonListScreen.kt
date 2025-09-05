package com.example.pokeapp.ui.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pokeapp.data.model.Pokemon
import com.example.pokeapp.ui.PokemonCard
import com.example.pokeapp.ui.viewmodel.PokemonViewModel



@Composable
fun PokemonListScreen(pokemonViewModel: PokemonViewModel = viewModel()) {
    val pokemons = pokemonViewModel.pokemonList.collectAsState()

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(pokemons.value) { pokemon: Pokemon ->
            PokemonCard(pokemon = pokemon) // 👈 ahora sí lo reconoce
        }
    }
}
