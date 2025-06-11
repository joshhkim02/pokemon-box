package com.pokemondb.pokemon_box.controller;

import com.pokemondb.pokemon_box.model.AddPokemonDTO;
import com.pokemondb.pokemon_box.model.Team;
import com.pokemondb.pokemon_box.model.TeamData;
import com.pokemondb.pokemon_box.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeamController {
    @Autowired
    TeamService teamService;

    @PostMapping("/team")
    public Team addTeam(@RequestBody Team team) {
        return teamService.saveTeam(team);
    }

    @PostMapping("/team/add")
    public TeamData addPokemonToTeam(@RequestBody AddPokemonDTO request) {
        return teamService.addPokemonToTeam(request.getTeamId(), request.getPokeId(), request.getPosition());
    }
}
