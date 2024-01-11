package com.example.Crowdfunding.controller;

import com.example.Crowdfunding.entities.Paiement;
import com.example.Crowdfunding.entities.Utilisateur;
import com.example.Crowdfunding.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "api/paiement")

public class PaiementController {
    @Autowired
    private PaiementService paiementService;


    @PostMapping
    public Paiement createPaiement(@Validated @RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }
    }

