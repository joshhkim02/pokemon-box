package com.pokemondb.pokemon_box.dto;

public class DeletePokemonDTO {
    private Integer team_id;
    private Integer poke_id;

    public DeletePokemonDTO(Integer team_id, Integer poke_id) {
        this.team_id = team_id;
        this.poke_id = poke_id;
    }

    public Integer getTeamId() {
        return team_id;
    }

    public void setTeamId(Integer team_id) {
        this.team_id = team_id;
    }

    public Integer getPokeId() {
        return poke_id;
    }

    public void setPokeId(Integer poke_id) {
        this.poke_id = poke_id;
    }
}
