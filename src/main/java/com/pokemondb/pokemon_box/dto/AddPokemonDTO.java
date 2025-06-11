package com.pokemondb.pokemon_box.dto;

public class AddPokemonDTO {
    private Integer team_id;
    private Integer poke_id;
    private Integer position;

    public AddPokemonDTO() {}

    public AddPokemonDTO(Integer team_id, Integer poke_id, Integer position) {
        this.team_id = team_id;
        this.poke_id = poke_id;
        this.position = position;
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
