package com.pokemondb.pokemon_box.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="pokemon_teams")
public class Team {

    @Id
    @Column(name="team_id")
    @GeneratedValue
    private Integer team_id;

    private String team_name;

    @OneToMany(mappedBy="pokemon_teams", cascade=CascadeType.ALL)
    @OrderBy("position")
    private List<TeamData> teamPokemon;
}
