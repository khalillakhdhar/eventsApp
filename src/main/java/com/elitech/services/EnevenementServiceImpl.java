package com.elitech.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elitech.dtos.EvenementDTO;

import com.elitech.entities.Evenement;
import com.elitech.mappers.EvenementMapper;
import com.elitech.repo.EvenementRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class EnevenementServiceImpl implements EvenementService {

	private final EvenementRepository evenementRepository;

	@Override
	public EvenementDTO getEvenementById(Long id) {
		// TODO Auto-generated method stub
		return EvenementMapper.toDTO(evenementRepository.findById(id).orElse(null));
	}

	@Override
	public Page<EvenementDTO> getAllEvenements(Pageable pageable) {
		// TODO Auto-generated method stub
	    Page<Evenement> evenements = evenementRepository.findAll(pageable);

		return evenements.map(EvenementMapper::toDTO);
	}

	@Override
	public EvenementDTO createEvenement(EvenementDTO evenementDTO) {
		// TODO Auto-generated method stub
		Evenement saved=evenementRepository.save(EvenementMapper.toEntity(evenementDTO));
		return EvenementMapper.toDTO(saved);
	}

	@Override
	public EvenementDTO updateEvenement(Long id, EvenementDTO evenementDTO) {
		// TODO Auto-generated method stub
		Evenement saved=evenementRepository.findById(id).orElse(null);
		return EvenementMapper.toDTO(saved);
		
	}

	@Override
	public void deleteEvenement(Long id) {
		// TODO Auto-generated method stub
evenementRepository.deleteById(id);
	}

}
