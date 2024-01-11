package com.example.Crowdfunding.service;

import com.example.Crowdfunding.Repository.CatégorieRepository;
import com.example.Crowdfunding.entities.Catégorie;
import com.example.Crowdfunding.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatégorieService {
    @Autowired
    private CatégorieRepository catégorieRepository;

    @Autowired
    public CatégorieService(CatégorieRepository catégorieRepository) {
        this.catégorieRepository = catégorieRepository;
    }


}