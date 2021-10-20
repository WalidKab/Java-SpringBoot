package com.warrior.warriors.model;

import javax.persistence.*;

@Entity
@Table(name="Caracter")
public class Character {
    //Propriétés de base de la classe Character
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name", length = 250, nullable = false)
    private String name;

    @Column(name = "type", length = 250, nullable = false)
    private String type;

    public Character() {
    }

    // Création du conbstructeur
    public Character(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Création des getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Création des setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Ajout de la méthode toString
    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
