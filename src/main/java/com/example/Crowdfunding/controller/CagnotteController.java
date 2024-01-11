package com.example.Crowdfunding.controller;

import com.example.Crowdfunding.entities.Cagnotte;
import com.example.Crowdfunding.service.CagnotteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "api/cagnotte")
public class CagnotteController {
    @Autowired


    private CagnotteService cagnotteService;

    @Autowired
    public CagnotteController(CagnotteService cagnotteService) {
        this.cagnotteService = cagnotteService;
    }

    @PostMapping
    public void createCagnotte(@RequestBody Cagnotte cagnotte) {
        cagnotteService.createCagnotte(cagnotte);
    }

    @GetMapping("/{id}")
    public Optional<Cagnotte> getCagnotteById(@PathVariable Long id) {
        return cagnotteService.getCagnotteById(id);
    }
    @GetMapping
    public List<Cagnotte> getAllCagnotte() {
        return cagnotteService.getAllCagnotte();
    }
    @DeleteMapping("/{id}")
    public void deleteCagnotte(@PathVariable Long id) {
        cagnotteService.deleteCagnotte(id);
    }
    @PutMapping("/{id}")
    public void updateCagnotte(@PathVariable Long id, @RequestBody Cagnotte cagnotte) {
        cagnotteService.updateCagnotte(id, cagnotte);
    }
}
