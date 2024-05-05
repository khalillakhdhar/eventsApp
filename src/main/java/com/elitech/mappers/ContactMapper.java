package com.elitech.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.elitech.dtos.ContactDTO;
import com.elitech.entities.Contact;

@Component
public class ContactMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

  
    public static ContactDTO toDTO(Contact contact) {
        return modelMapper.map(contact, ContactDTO.class);
    }

    public static Contact toEntity(ContactDTO contactDTO) {
        return modelMapper.map(contactDTO, Contact.class);
    }
}
