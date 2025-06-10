package com.pokemondb.pokemon_box.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
    @Entity - tells JPA to treat it as an entity, mapping it to a table
        - Allows interaction with databases using Java objects instead of raw SQL
    @Table - specifies table name to look for

    Notes:
        - When using JPA, a no-arg constructor and primary key must be used in the entity
*/

@Entity
@Table(name="pokemon_data")
public class Pokemon {

    /*
        @Id - identifies the variable that is the primary key
        @Column - identifies which column to look at for the primary key
    */

    @Id
    @Column(name="poke_id")
    private Integer id;

    private String name;
    private String type_one;
    private String type_two;
    private Integer total;
    private Integer health;
    private Integer attack;
    private Integer defense;
    private Integer sp_attack;
    private Integer sp_defense;
    private Integer speed;

    // No-arg constructor required for JPA
    protected Pokemon() {}

    public Pokemon(Integer id, String name, String type_one, String type_two, Integer total, Integer health, Integer attack, Integer defense, Integer sp_attack, Integer sp_defense, Integer speed) {
        this.id = id;
        this.name = name;
        this.type_one = type_one;
        this.type_two = type_two;
        this.total = total;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.sp_attack = sp_attack;
        this.sp_defense = sp_defense;
        this.speed = speed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType_one() {
        return type_one;
    }

    public void setType_one(String type_one) {
        this.type_one = type_one;
    }

    public String getType_two() {
        return type_two;
    }

    public void setType_two(String type_two) {
        this.type_two = type_two;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSp_attack() {
        return sp_attack;
    }

    public void setSp_attack(Integer sp_attack) {
        this.sp_attack = sp_attack;
    }

    public Integer getSp_defense() {
        return sp_defense;
    }

    public void setSp_defense(Integer sp_defense) {
        this.sp_defense = sp_defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type_one='" + type_one + '\'' +
                ", type_two='" + type_two + '\'' +
                ", total=" + total +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", sp_attack=" + sp_attack +
                ", sp_defense=" + sp_defense +
                ", speed=" + speed +
                '}';
    }
}
