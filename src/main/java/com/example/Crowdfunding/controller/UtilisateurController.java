package com.example.Crowdfunding.controller;


import com.example.Crowdfunding.entities.Utilisateur;
import com.example.Crowdfunding.service.UtilisateurService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/login")
    public ResponseEntity<Utilisateur> loginUser(@RequestBody Utilisateur utilisateur) {
        String email = utilisateur.getEmail();
        String password = utilisateur.getPassword();

        // Use your MemberService to authenticate the member
        Utilisateur loggedInUser = utilisateurService.loginUser(email, password);

        if (loggedInUser != null) {

            return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
        } else {
            // Authentication failed
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }
    @PostMapping("/register")
    public void createUser(@RequestBody Utilisateur utilisateur) {
        utilisateurService.createUser(utilisateur);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable Long id) {
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(id);
        if (utilisateur != null) {
            return new ResponseEntity<>(utilisateur, HttpStatus.OK);
        } else {
            // If no user is found with the given ID, you can return an appropriate response
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/allUsers")
    public ResponseEntity<List<Utilisateur>> getAllUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
        if (utilisateurs != null && !utilisateurs.isEmpty()) {
            return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
        } else {
            // If no users are found, you can return an empty list or choose an appropriate response
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    }



