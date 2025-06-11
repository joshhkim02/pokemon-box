package com.pokemondb.pokemon_box.model;

import java.io.Serializable;
import java.util.Objects;

/*
    Composite primary key
        - a primary key that consists of 2 or more columns
        - useful in this case where TeamData has no need for its own primary key but
          has references to the Team and Pokemon models
        - created using @IdClass/@Id OR @Embeddable/@EmbeddedId
    Rules for creating a composite primary key class
        - must be public
        - implements Serializable interface
        - has a no-arg constructor
        - define equals() and hashCode() methods
*/

// Implementing Serializable interface and is public
public class TeamDataComposite implements Serializable {
    // Variables that match foreign keys
    private Integer team;
    private Integer pokemon;

    // Mandatory no-arg constructor
    public TeamDataComposite() {}

    public TeamDataComposite(Integer team, Integer pokemon) {
        this.team = team;
        this.pokemon = pokemon;
    }

    // Mandatory equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamDataComposite)) return false;
        TeamDataComposite that = (TeamDataComposite) o;
        return Objects.equals(team, that.team) && Objects.equals(pokemon, that.pokemon);
    }

    // Mandatory hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(team, pokemon);
    }
}