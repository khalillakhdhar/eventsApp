package com.elitech.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.dtos.EvenementDTO;

public interface EvenementService {
    EvenementDTO getEvenementById(Long id);
    Page<EvenementDTO> getAllEvenements(Pageable pageable);
    EvenementDTO createEvenement(EvenementDTO evenementDTO);
    EvenementDTO updateEvenement(Long id, EvenementDTO evenementDTO);
    void deleteEvenement(Long id);
}
