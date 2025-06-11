package com.pokemondb.pokemon_box.model;

import java.io.Serializable;
import java.util.Objects;

public class TeamDataId implements Serializable {
    private Integer team;  // matches the foreign key type
    private Integer pokemon; // matches the foreign key type

    public TeamDataId() {}

    public TeamDataId(Integer team, Integer pokemon) {
        this.team = team;
        this.pokemon = pokemon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamDataId)) return false;
        TeamDataId that = (TeamDataId) o;
        return Objects.equals(team, that.team) && Objects.equals(pokemon, that.pokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, pokemon);
    }
}