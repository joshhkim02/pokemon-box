package com.pokemondb.pokemon_box.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class TeamData {
    @ManyToOne
//    @MapsId("team_id")
    @JoinColumn(name="team_id")
    private Team team;

    @ManyToOne
//    @MapsId("id")
    @JoinColumn(name="poke_id")
    private Pokemon pokemon;

    private Integer position;
}
