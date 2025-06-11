package com.pokemondb.pokemon_box.model;

public class AddPokemonDTO {
    private Integer teamId;
    private Integer pokeId;
    private Integer position;

    public AddPokemonDTO() {}

    public AddPokemonDTO(Integer teamId, Integer pokeId, Integer position) {
        this.teamId = teamId;
        this.pokeId = pokeId;
        this.position = position;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getPokeId() {
        return pokeId;
    }

    public void setPokeId(Integer pokeId) {
        this.pokeId = pokeId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
