package com.matchezmoi.sitederencontre_springboot.entities;

import javax.persistence.*;

@Entity
@Table(name = "orientation")
public class Orientation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 64, nullable = false, unique = true)
    private String nom;

    public Orientation() {
    }

    public Orientation(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Orientation{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
