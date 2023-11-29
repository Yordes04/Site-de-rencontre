package com.matchezmoi.sitederencontre_springboot.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "utilisateur")
public class Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 64, nullable = false)
    private String nom;
    @Column(length = 64, nullable = false)
    private String prenom;
    @Column(length = 64, nullable = false)
    private String mot_passe;
    @Column(length = 64, nullable = false)
    private String nom_utilisateur;
    @ManyToOne(optional = false)
    @JoinColumn(name = "orientation_id", nullable = false)
    private Orientation orientation;
    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
    @ManyToOne(optional = false)
    @JoinColumn(name = "sexe_id", nullable = false)
    private Sexe sexe;
    @ManyToOne(optional = false)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;
    @Column(length = 64, nullable = false)
    private String age;
    @Column(length = 128, nullable = false, unique = true)
    private String email;
    @Column(length = 512, nullable = false)
    private String description;
    private String photo;
    private boolean active;

    @ManyToMany
    @JoinTable(name = "utilisateur_match",
            joinColumns = @JoinColumn(name = "utilisateur_id"),
            inverseJoinColumns = @JoinColumn(name = "match_id"))
    private List<Utilisateur> listeMatch;

    @ManyToMany
    @JoinTable(name = "utilisateur_favoris",
            joinColumns = @JoinColumn(name = "utilisateur_id"),
            inverseJoinColumns = @JoinColumn(name = "favoris_id"))
    private List<Utilisateur> listeFavoris;

    @ManyToMany
    @JoinTable(name = "utilisateur_passion",
            joinColumns = @JoinColumn(name = "utilisateur_id"),
            inverseJoinColumns = @JoinColumn(name = "passion_id"))
    private Set<Passion> passions = new HashSet<>();


    public Utilisateur() {
    }

    public Utilisateur(int id, String nom, String prenom, String mot_passe, String nom_utilisateur, Orientation orientation, Role role, Sexe sexe, Region region, String age, String email, String description, String photo, boolean active) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mot_passe = mot_passe;
        this.nom_utilisateur = nom_utilisateur;
        this.orientation = orientation;
        this.role = role;
        this.sexe = sexe;
        this.region = region;
        this.age = age;
        this.email = email;
        this.description = description;
        this.photo = photo;
        this.active = active;
        passions = new HashSet<>();
    }

    public Utilisateur(int id, String nom, String prenom, String mot_passe, String nom_utilisateur, Orientation orientation, Role role, Sexe sexe, Region region, String age, String email, String description, String photo, boolean active, List<Utilisateur> listeMatch, List<Utilisateur> listeFavoris) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mot_passe = mot_passe;
        this.nom_utilisateur = nom_utilisateur;
        this.orientation = orientation;
        this.role = role;
        this.sexe = sexe;
        this.region = region;
        this.age = age;
        this.email = email;
        this.description = description;
        this.photo = photo;
        this.active = active;
        this.listeMatch = listeMatch;
        this.listeFavoris = listeFavoris;
        passions = new HashSet<>();
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMot_passe() {
        return mot_passe;
    }

    public void setMot_passe(String mot_passe) {
        this.mot_passe = mot_passe;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Utilisateur> getListeMatch() {
        return listeMatch;
    }

    public void setListeMatch(List<Utilisateur> listeMatch) {
        this.listeMatch = listeMatch;
    }

    public List<Utilisateur> getListeFavoris() {
        return listeFavoris;
    }

    public void setListeFavoris(List<Utilisateur> listeFavoris) {
        this.listeFavoris = listeFavoris;
    }

    public Set<Passion> getPassions() {
        return passions;
    }

    public void setPassions(Set<Passion> passions) {
        this.passions = passions;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mot_passe='" + mot_passe + '\'' +
                ", nom_utilisateur='" + nom_utilisateur + '\'' +
                ", orientation=" + orientation +
                ", role=" + role +
                ", sexe=" + sexe +
                ", region=" + region +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                ", active=" + active +
                ", listeMatch=" + listeMatch +
                ", listeFavoris=" + listeFavoris +
                ", passions=" + passions +
                '}';
    }
}
