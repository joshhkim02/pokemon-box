package com.pokemondb.pokemon_box.dto;

public class UpdatePokemonDTO {
    private Integer oldPokeId;
    private Integer newPokeId;

    public UpdatePokemonDTO() {}

    public UpdatePokemonDTO(Integer oldPokeId, Integer newPokeId) {
        this.oldPokeId = oldPokeId;
        this.newPokeId = newPokeId;
    }

    public Integer getOldPokeId() {
        return oldPokeId;
    }

    public void setOldPokeId(Integer oldPokeId) {
        this.oldPokeId = oldPokeId;
    }

    public Integer getNewPokeId() {
        return newPokeId;
    }

    public void setNewPokeId(Integer newPokeId) {
        this.newPokeId = newPokeId;
    }
}
