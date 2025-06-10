package com.pokemondb.pokemon_box.service;

import com.pokemondb.pokemon_box.model.Pokemon;
import com.pokemondb.pokemon_box.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    /*
        @Autowired - Automatic dependency injection
            - Eliminates need for manual configuration and object creation
            - Resolves and injects require dependencies automatically
    */
    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon(){
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> getPokemonById(int pokeId) {
        return pokemonRepository.findById(pokeId);
    }
}
