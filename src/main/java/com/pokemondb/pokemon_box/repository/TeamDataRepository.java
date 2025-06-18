package com.pokemondb.pokemon_box.repository;

import com.pokemondb.pokemon_box.dto.GetPokemonTeamDTO;
import com.pokemondb.pokemon_box.model.TeamData;
import com.pokemondb.pokemon_box.model.TeamDataComposite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamDataRepository extends JpaRepository<TeamData, TeamDataComposite> {
    @Query("SELECT new com.pokemondb.pokemon_box.dto.GetPokemonTeamDTO(td.pokemon.id, td.position, td.pokemon.name) FROM TeamData td WHERE td.team.id = :teamId ORDER BY td.position")
    List<GetPokemonTeamDTO> findPokemonByTeamId(@Param("teamId") Integer teamId);
}
