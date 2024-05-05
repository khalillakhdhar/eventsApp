package com.elitech.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.elitech.dtos.EvenementDTO;
import com.elitech.services.EvenementService;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

    private final EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EvenementDTO> getEvenementById(@PathVariable Long id) {
        EvenementDTO evenementDTO = evenementService.getEvenementById(id);
        return ResponseEntity.ok(evenementDTO);
    }

    @GetMapping
    public ResponseEntity<Page<EvenementDTO>> getAllEvenements(Pageable pageable) {
        Page<EvenementDTO> evenements = evenementService.getAllEvenements(pageable);
        return ResponseEntity.ok(evenements);
    }

    @PostMapping
    public ResponseEntity<EvenementDTO> createEvenement(@RequestBody EvenementDTO evenementDTO) {
        EvenementDTO createdEvenement = evenementService.createEvenement(evenementDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEvenement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EvenementDTO> updateEvenement(@PathVariable Long id, @RequestBody EvenementDTO evenementDTO) {
        EvenementDTO updatedEvenement = evenementService.updateEvenement(id, evenementDTO);
        return ResponseEntity.ok(updatedEvenement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvenement(@PathVariable Long id) {
        evenementService.deleteEvenement(id);
        return ResponseEntity.noContent().build();
    }
}
