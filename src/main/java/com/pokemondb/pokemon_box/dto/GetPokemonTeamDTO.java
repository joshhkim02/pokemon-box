package com.pokemondb.pokemon_box.dto;

public class GetPokemonTeamDTO {
    private Integer pokeId;
    private Integer position;
    private String name;

    public GetPokemonTeamDTO() {}

    public GetPokemonTeamDTO(Integer pokeId, Integer position, String name) {
        this.pokeId = pokeId;
        this.position = position;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
