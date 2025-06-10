package com.pokemondb.pokemon_box.service;

import com.pokemondb.pokemon_box.model.Pokemon;
import com.pokemondb.pokemon_box.model.Team;
import com.pokemondb.pokemon_box.model.TeamData;
import com.pokemondb.pokemon_box.repository.TeamDataRepository;
import com.pokemondb.pokemon_box.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamDataRepository teamDataRepository;

    // Create team
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    // Read specific team
    public Optional<Team> getTeamById(int id) {
        return teamRepository.findById(id);
    }

    // Update team
    public Team updateTeamName(int teamId, String newName) {
        Team team = teamRepository.findById(teamId).orElseThrow(() -> new RuntimeException("Team not found"));

        team.setTeam_name(newName);

        return teamRepository.save(team);
    }

    // Delete team
    public void deleteTeam(int id){
        Team team = teamRepository.findById(id).orElseThrow(() -> new RuntimeException("Team not found"));
        teamRepository.delete(team);
    }
    
}
