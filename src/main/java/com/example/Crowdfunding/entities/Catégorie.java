package com.example.Crowdfunding.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "catégorie")
public class Catégorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_catégorie")
    private String nom_catégorie;
    @Column(name = "id_cagnotte")
    private int id_cagnotte;

    public Catégorie() {

    }

    public Catégorie(Long id, String nom_catégorie, int id_cagnotte) {
        this.id = id;
        this.nom_catégorie = nom_catégorie;
        this.id_cagnotte = id_cagnotte;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_catégorie() {
        return nom_catégorie;
    }

    public void setNom_catégorie(String nom_catégorie) {
        this.nom_catégorie = nom_catégorie;
    }

    public int getId_cagnotte() {
        return id_cagnotte;
    }

    public void setId_cagnotte(int id_cagnotte) {
        this.id_cagnotte = id_cagnotte;
    }

    public void setCatégorie_name(String nomCatégorie) {
    }


}