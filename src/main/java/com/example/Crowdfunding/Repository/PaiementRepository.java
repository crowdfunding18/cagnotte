package com.example.Crowdfunding.Repository;

import com.example.Crowdfunding.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}