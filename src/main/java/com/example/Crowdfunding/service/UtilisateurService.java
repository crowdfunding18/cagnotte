package com.example.Crowdfunding.service;


import com.example.Crowdfunding.Repository.UtilisteurRepository;
import com.example.Crowdfunding.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UtilisateurService {

    private final UtilisteurRepository utilisateurRepository;

    @Autowired
    public UtilisateurService(UtilisteurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur createUser(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
    public Utilisateur findByEmailAndPassword(String email, String password) {
        return utilisateurRepository.findByEmailAndPassword(email, password);
    }

    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur) {
        Utilisateur existingUtilisateur = utilisateurRepository.findById(id).orElse(null);
        if (existingUtilisateur != null) {
            existingUtilisateur.setNom(utilisateur.getNom());
            existingUtilisateur.setPassword(utilisateur.getPassword());
            return utilisateurRepository.save(existingUtilisateur);
        }
        return null;
    }

    public boolean deleteUtilisateur(Long id) {
        Utilisateur existingUtilisateur = utilisateurRepository.findById(id).orElse(null);
        if (existingUtilisateur != null) {
            utilisateurRepository.delete(existingUtilisateur);
            return true;
        }
        return false;
    }
    public Utilisateur loginUser(String email, String password) {
        // In a real-world scenario, you would hash the password before querying the database
        return utilisateurRepository.findByEmailAndPassword(email, password);
    }
}

