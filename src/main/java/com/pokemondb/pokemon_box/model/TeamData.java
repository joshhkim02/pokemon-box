package com.pokemondb.pokemon_box.model;

import jakarta.persistence.*;


@Entity
@IdClass(TeamDataId.class)
public class TeamData {

    @Id
    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    @Id
    @ManyToOne
    @JoinColumn(name="poke_id")
    private Pokemon pokemon;

    private Integer position;

    protected TeamData() {}

    public TeamData(Team team, Pokemon pokemon, Integer position) {
        this.team = team;
        this.pokemon = pokemon;
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "TeamData{" +
                "team=" + team +
                ", pokemon=" + pokemon +
                ", position=" + position +
                '}';
    }

}
