package com.pokemondb.pokemon_box.repository;

import com.pokemondb.pokemon_box.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
