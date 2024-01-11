package com.example.Crowdfunding.service;

import com.example.Crowdfunding.Repository.PaiementRepository;
import com.example.Crowdfunding.entities.Paiement;
import com.example.Crowdfunding.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementService {
    @Autowired
    private PaiementRepository paiementRepository;

   public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    public Paiement getPaiement(Long id) {
        return null;
    }

    public Paiement save(Paiement paiement) {


        return paiementRepository.save(paiement);
    }

    void deletePaiement(Long id) {
    }

    public <PaiementRequest> ResponseEntity<?> processPaiement(PaiementRequest paiementRequest) {
        try {
            // Validate paymentRequest data

            // Create payment
            Utilisateur utilisateur = new Utilisateur();
            Paiement paiement = paiementRepository.save(new Paiement(paiementRequest, utilisateur));
            return ResponseEntity.ok(paiement);
        } catch (Exception e) {
            // Return error response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
