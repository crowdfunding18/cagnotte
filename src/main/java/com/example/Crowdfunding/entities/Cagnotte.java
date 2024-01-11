package com.example.Crowdfunding.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cagnotte")
public class Cagnotte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @Column(name = "prix")
    private float prix;
    @Column(name = "photo_url")
    private String photo_url;
    @Column(name = "data_de_creation")
    private Date data_de_creation;

    @ManyToOne
    @JoinColumn(name = "catégorie_id")
    private Catégorie catégorie;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "cagnotte")
    private List<Paiement> paiements;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public Date getData_de_creation() {
        return data_de_creation;
    }

    public void setData_de_creation(Date data_de_creation) {
        this.data_de_creation = data_de_creation;
    }

    public Catégorie getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(Catégorie catégorie) {
        this.catégorie = catégorie;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
}