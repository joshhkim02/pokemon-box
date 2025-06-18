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
    private Integer teamId;

    private String teamName;

    @OneToMany(mappedBy="team", cascade=CascadeType.ALL)
    @OrderBy("position")
    private List<TeamData> teamData = new ArrayList<>();

    protected Team() {}

    public Team(Integer teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
