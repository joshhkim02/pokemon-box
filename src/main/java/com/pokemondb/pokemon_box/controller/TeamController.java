package com.pokemondb.pokemon_box.controller;

import com.pokemondb.pokemon_box.dto.*;
import com.pokemondb.pokemon_box.model.Team;
import com.pokemondb.pokemon_box.model.TeamData;
import com.pokemondb.pokemon_box.service.TeamService;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TeamController {
    @Autowired
    TeamService teamService;

    @PostMapping("/team")
    public Team addTeam(@RequestBody Team team) {
        return teamService.saveTeam(team);
    }

    @GetMapping("/team/{id}")
    public Optional<Team> getTeam(@PathVariable Integer id) {
        return teamService.getTeamById(id);
    }

    @PutMapping("/team/{id}")
    public Team updateTeam(@PathVariable Integer id, @RequestBody UpdateTeamNameDTO request) {
        return teamService.updateTeamName(id, request.getNewName());
    }

    @DeleteMapping("/team/{id}")
    public void deleteTeam(@PathVariable Integer id) {
        teamService.deleteTeam(id);
    }

    @PostMapping("/team/add")
    public TeamData addPokemonToTeam(@RequestBody AddPokemonDTO request) {
        return teamService.addPokemonToTeam(request.getTeamId(), request.getPokeId(), request.getPosition());
    }

    @GetMapping("/team/add/{id}")
    public List<GetPokemonTeamDTO> getPokemonFromTeam(@PathVariable Integer id) {
        return teamService.getPokemonFromTeam(id);
    }

    @PutMapping("/team/add/{id}")
    public TeamData updatePokemonOnTeam(@PathVariable Integer id, @RequestBody UpdatePokemonDTO request) {
        return teamService.updatePokemonInTeam(id, request.getOldPokeId(), request.getNewPokeId());
    }

    @DeleteMapping("/team/add")
    public ResponseEntity<String> deletePokemonFromTeam(@RequestBody DeletePokemonDTO request) {
        teamService.deletePokemonFromTeam(request.getTeamId(), request.getPokeId());
        return ResponseEntity.ok("Pokemon removed successfully");
    }

}