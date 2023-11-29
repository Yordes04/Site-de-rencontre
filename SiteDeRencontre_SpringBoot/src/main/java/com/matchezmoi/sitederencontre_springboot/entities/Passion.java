package com.matchezmoi.sitederencontre_springboot.entities;

import javax.persistence.*;

@Entity
@Table(name = "passion")
public class Passion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 64, nullable = false)
    private String nom;

    public Passion() {
    }

    public Passion(int id, String nom) {
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
        return "Passion{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
