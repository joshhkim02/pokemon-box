package com.pokemondb.pokemon_box.repository;

import com.pokemondb.pokemon_box.dto.GetPokemonTeamDTO;
import com.pokemondb.pokemon_box.model.Team;
import com.pokemondb.pokemon_box.model.TeamData;
import com.pokemondb.pokemon_box.model.TeamDataComposite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamDataRepository extends JpaRepository<TeamData, TeamDataComposite> {
//    @Query(value="SELECT td.poke_id, td.position, pd.name FROM team_data AS td JOIN pokemon_data AS pd on td.poke_id = pd.poke_id WHERE team_id = ?1 ORDER BY td.position", nativeQuery = true)
//    List<TeamData> findPokemonByTeamId(Integer teamId);

//    @Query("SELECT td FROM TeamData td WHERE td.team.id = :teamId ORDER BY td.position")
//    List<TeamData> findPokemonByTeamId(@Param("teamId") Integer teamId);

    @Query("SELECT new com.pokemondb.pokemon_box.dto.GetPokemonTeamDTO(td.pokemon.id, td.position, td.pokemon.name) FROM TeamData td WHERE td.team.id = :teamId ORDER BY td.position")
    List<GetPokemonTeamDTO> findPokemonByTeamId(@Param("teamId") Integer teamId);
}

//SELECT td.poke_id, td.position, pd.name
//FROM team_data AS td
//JOIN pokemon_data AS pd ON td.poke_id = pd.poke_id
//WHERE team_id = 1
//ORDER BY td.position

//    @Query(value="SELECT name, poke_id, team_id FROM team_data JOIN pokemon_data ON team_data.team_id = pokemon_data.poke_id WHERE team.id = ")
//    List<TeamData> findPokemonByTeamId(@Param("teamId") Integer teamId);