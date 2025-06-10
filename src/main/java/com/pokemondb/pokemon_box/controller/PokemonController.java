package com.pokemondb.pokemon_box.controller;

import com.pokemondb.pokemon_box.model.Pokemon;
import com.pokemondb.pokemon_box.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    public List<Pokemon> getPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/pokemon/{id}")
    public Optional<Pokemon> getSpecificPokemon(@PathVariable int id) {
        return pokemonService.getPokemonById(id);
    }
}
