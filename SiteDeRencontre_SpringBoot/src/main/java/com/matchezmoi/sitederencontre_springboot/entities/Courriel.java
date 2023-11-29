package com.matchezmoi.sitederencontre_springboot.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "courriel")
public class Courriel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 64, nullable = false)
    private String expediteur;
    @Column(length = 64, nullable = false)
    private String destinateur;
    @Column(length = 64, nullable = false)
    private String sujet;
    @Column(length = 512, nullable = false)
    private String contenu;
    @Column(length = 45, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    public Courriel() {
    }

    public Courriel(int id, String expediteur, String destinateur, String sujet, String contenu, Date date) {
        this.id = id;
        this.expediteur = expediteur;
        this.destinateur = destinateur;
        this.sujet = sujet;
        this.contenu = contenu;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getDestinateur() {
        return destinateur;
    }

    public void setDestinateur(String destinateur) {
        this.destinateur = destinateur;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Courriel{" +
                "id=" + id +
                ", expediteur='" + expediteur + '\'' +
                ", destinateur='" + destinateur + '\'' +
                ", sujet='" + sujet + '\'' +
                ", contenu='" + contenu + '\'' +
                ", date=" + date +
                '}';
    }
}
