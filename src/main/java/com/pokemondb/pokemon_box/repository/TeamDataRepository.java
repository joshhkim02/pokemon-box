package com.pokemondb.pokemon_box.repository;

import com.pokemondb.pokemon_box.model.TeamData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDataRepository extends JpaRepository<TeamData, Integer> { }
