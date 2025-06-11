package com.pokemondb.pokemon_box.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pokemon_teams")
public class Team {

    @Id
    @Column(name="team_id")
    @GeneratedValue
    private Integer team_id;

    private String team_name;

    @OneToMany(mappedBy="team", cascade=CascadeType.ALL)
    @OrderBy("position")
    private List<TeamData> teamData = new ArrayList<>();

    protected Team() {}

    public Team(Integer team_id, String team_name) {
        this.team_id = team_id;
        this.team_name = team_name;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team_id=" + team_id +
                ", team_name='" + team_name + '\'' +
                '}';
    }
}
