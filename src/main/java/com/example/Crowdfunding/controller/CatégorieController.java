package com.example.Crowdfunding.controller;


import com.example.Crowdfunding.Repository.CatégorieRepository;
import com.example.Crowdfunding.entities.Cagnotte;
import com.example.Crowdfunding.entities.Catégorie;
import com.example.Crowdfunding.service.CagnotteService;
import com.example.Crowdfunding.service.CatégorieService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/categories")
public class CatégorieController {

    @Autowired
    private CatégorieRepository catégorieRepository;

    @GetMapping
    public List<Catégorie> getAllCatégories() {
        return catégorieRepository.findAll();
    }

    @PostMapping
    public Catégorie createCategorie(@Validated @RequestBody Catégorie categorie) {
        return catégorieRepository.save(categorie);
    }

    @GetMapping("/{id}")
    public Catégorie getCatégorieById(@PathVariable Long id) {
        return catégorieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Catégorie not found for this id: " + id));
    }

    @PutMapping("/{id}")
    public Catégorie updateCatégorie(@PathVariable Long id, @Validated @RequestBody Catégorie catégorie) {
        return catégorieRepository.findById(id).map(catégorieToUpdate -> {
            catégorieToUpdate.setId(catégorie.getId());
            return catégorieRepository.save(catégorieToUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("Catégorie not found for this id: " + id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategorie(@PathVariable Long id) {
        return catégorieRepository.findById(id).map(catégorie -> {
            catégorieRepository.delete(catégorie);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Categorie not found for this id: " + id));
    }
}



