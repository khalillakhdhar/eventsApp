package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dtos.EvenementDTO;
import com.elitech.entities.Evenement;

public class EvenementMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	  
    public static EvenementDTO toDTO(Evenement evenement) {
        return modelMapper.map(evenement, EvenementDTO.class);
    }

    public static Evenement toEntity(EvenementDTO evenementDTO) {
        return modelMapper.map(evenementDTO, Evenement.class);
    }
}
