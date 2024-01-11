package com.example.Crowdfunding.entities;


import javax.persistence.*;

@Entity
@Table(name = "utilisateur")


public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cin")
    private int cin;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "password")

    private String password;
    @Column(name = "confirmermot_de_passe")
    private String confirmermot_de_passe;
    @Column(name = "type_de_utilisateur")
    private String type_de_utilisateur;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "categorie")
    private String categorie;

    public Utilisateur() {
    }

    public Utilisateur(String password) {
        this.password = password;
    }

    public Utilisateur(Long id, int cin, String categorie, String nom, String email, String prenom, String password, String confirmermot_de_passe, String type_de_utilisateur, String adresse, String telephone) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.confirmermot_de_passe = confirmermot_de_passe;
        this.type_de_utilisateur = type_de_utilisateur;
        this.adresse = adresse;
        this.telephone = telephone;
        this.categorie = categorie;

    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getConfirmermot_de_passe() {
        return confirmermot_de_passe;
    }

    public void setConfirmermot_de_passe(String confirmermot_de_passe) {
        this.confirmermot_de_passe = confirmermot_de_passe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    public String getType_de_utilisateur() {
        return type_de_utilisateur;
    }

    public void setType_de_utilisateur(String type_de_utilisateur) {
        this.type_de_utilisateur = type_de_utilisateur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
