package com.example.Crowdfunding.service;

import com.example.Crowdfunding.Repository.CagnotteRepository;
import com.example.Crowdfunding.entities.Cagnotte;
import com.example.Crowdfunding.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CagnotteService {
    @Autowired
    private CagnotteRepository cagnotteRepository;

    @Autowired
    public CagnotteService(CagnotteRepository cagnotteRepository) {
        this.cagnotteRepository = cagnotteRepository;
    }

    public void createCagnotte(Cagnotte cagnotte) {
        cagnotteRepository.save(cagnotte);
    }

    public List<Cagnotte> getAllCagnotte() {
        return cagnotteRepository.findAll();
    }

    public Optional<Cagnotte> getCagnotteById(Long id) {
        return cagnotteRepository.findById(id);
    }

    public void deleteCagnotte(Long id) {
        cagnotteRepository.deleteById(id);
    }

    public void updateCagnotte(Long id, Cagnotte cagnotte) {
        Cagnotte existingCagnotte = cagnotteRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("cagnotte not found"));
        // Update fields as needed
        existingCagnotte.setNom(cagnotte.getNom());
        // ... update other fields
        cagnotteRepository.save(existingCagnotte);
    }
}
