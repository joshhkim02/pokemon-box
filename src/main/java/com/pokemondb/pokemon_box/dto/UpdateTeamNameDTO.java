package com.pokemondb.pokemon_box.dto;

public class UpdateTeamNameDTO {
    private String newName;

    public UpdateTeamNameDTO() {}

    public UpdateTeamNameDTO(String newName) {
        this.newName = newName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }
}
