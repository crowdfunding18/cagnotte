package com.example.Crowdfunding.Repository;

import com.example.Crowdfunding.entities.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository


public interface UtilisteurRepository extends JpaRepository<Utilisateur, Long>{
    Utilisateur findByEmailAndPassword(String email, String password);
}
