package com.pokemondb.pokemon_box.service;

import com.pokemondb.pokemon_box.dto.GetPokemonTeamDTO;
import com.pokemondb.pokemon_box.model.Pokemon;
import com.pokemondb.pokemon_box.model.Team;
import com.pokemondb.pokemon_box.model.TeamData;
import com.pokemondb.pokemon_box.model.TeamDataComposite;
import com.pokemondb.pokemon_box.repository.PokemonRepository;
import com.pokemondb.pokemon_box.repository.TeamDataRepository;
import com.pokemondb.pokemon_box.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamDataRepository teamDataRepository;

    @Autowired
    private PokemonRepository pokemonRepository;

    // Create team
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    // Read specific team
    public Optional<Team> getTeamById(Integer id) {
        return teamRepository.findById(id);
    }

    // Update team
    public Team updateTeamName(Integer teamId, String newName) {
        Team team = teamRepository.findById(teamId).orElseThrow(() -> new RuntimeException("Team not found"));
        team.setTeamName(newName);
        return teamRepository.save(team);
    }

    // Delete team
    public void deleteTeam(Integer id){
        Team team = teamRepository.findById(id).orElseThrow(() -> new RuntimeException("Team not found"));
        teamRepository.delete(team);
    }

    // Helper method for composite key
    public TeamDataComposite createCompositeKey(Integer teamId, Integer pokeId) {
        return new TeamDataComposite(teamId, pokeId);
    }

    // Helper method to get TeamData info
    private TeamData getTeamData(Integer teamId, Integer pokeId) {
        TeamDataComposite key = createCompositeKey(teamId, pokeId);
        return teamDataRepository.findById(key)
                .orElseThrow(() -> new RuntimeException(
                        String.format("TeamData not found for team %d and pokemon %d", teamId, pokeId)));
    }

    // Create Pokemon for team
    public TeamData addPokemonToTeam(Integer team_id, Integer poke_id, Integer position) {
        Team team = teamRepository.findById(team_id)
                .orElseThrow(() -> new RuntimeException("Team not found"));

        Pokemon pokemon = pokemonRepository.findById(poke_id).orElseThrow(() -> new RuntimeException("Pokemon not found"));

        TeamData teamData = new TeamData(team, pokemon, position);
        return teamDataRepository.save(teamData);
    }

    // Read Pokemon from team
    public List<GetPokemonTeamDTO> getPokemonFromTeam(Integer team_id) {
        return teamDataRepository.findPokemonByTeamId(team_id);
    }

    // Update Pokemon in team
    public TeamData updatePokemonInTeam(Integer teamId, Integer oldPokeId, Integer newPokeId) {
        TeamData currentTeam = getTeamData(teamId, oldPokeId);
        Integer position = currentTeam.getPosition();
        System.out.println(position);
        Team team = currentTeam.getTeam();

        Pokemon newPokemon = pokemonRepository.findById(newPokeId)
                .orElseThrow(() -> new RuntimeException("Pokemon not found"));

        TeamDataComposite oldPokemon = createCompositeKey(teamId, oldPokeId);
        teamDataRepository.deleteById(oldPokemon);

        TeamData newPokemonEntry = new TeamData(team, newPokemon, position);
        return teamDataRepository.save(newPokemonEntry);
    }

    // Delete Pokemon from team
    public void deletePokemonFromTeam(Integer teamId, Integer pokeId) {
        TeamDataComposite compositeKey = createCompositeKey(teamId, pokeId);
        teamDataRepository.deleteById(compositeKey);
    }
}
