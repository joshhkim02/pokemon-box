package com.pokemondb.pokemon_box.repository;

import com.pokemondb.pokemon_box.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    @Repository - provides mechanism for CRUD operations
        - JpaRepository provides deeper functionality for database operations
        - Already provides CRUD operations and more out the box
*/

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> { }
