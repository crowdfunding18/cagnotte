package com.example.Crowdfunding.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "paiement")

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "montant")
    private Double montant;
    @Column(name = "numero_carte")
    private int numero_carte;
    @Column(name = "data_création")
    private Date data_création;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "cagnotte_id")
    private Cagnotte cagnotte;


    public <PaiementRequest> Paiement(PaiementRequest paiementRequest, Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Paiement() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public int getNumero_carte() {
        return numero_carte;
    }

    public void setNumero_carte(int numero_carte) {
        this.numero_carte = numero_carte;
    }

    public Date getData_création() {
        return data_création;
    }

    public void setData_création(Date data_création) {
        this.data_création = data_création;
    }

    public Utilisateur getUser() {
        return utilisateur;
    }

    public void setUser(Utilisateur user) {
        this.utilisateur = utilisateur;
    }

    public Cagnotte getCagnotte() {
        return cagnotte;
    }

    public void setCagnotte(Cagnotte cagnotte) {
        this.cagnotte = cagnotte;
    }
}