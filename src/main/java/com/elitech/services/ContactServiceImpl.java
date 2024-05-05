package com.elitech.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elitech.dtos.ContactDTO;
import com.elitech.entities.Contact;
import com.elitech.mappers.ContactMapper;
import com.elitech.repo.ContactRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class ContactServiceImpl implements ContactService {
	private final ContactRepository contactRepository;

	@Override
	public ContactDTO getContactById(Long id) {
		// TODO Auto-generated method stub
		return ContactMapper.toDTO(contactRepository.findById(id).orElse(null));
	}

	@Override
	public Page<ContactDTO> getAllContacts(Pageable pageable) {
		// TODO Auto-generated method stub
	    Page<Contact> contacts = contactRepository.findAll(pageable);

		return contacts.map(ContactMapper::toDTO);
	}

	@Override
	public ContactDTO createContact(ContactDTO contactDTO) {
		// TODO Auto-generated method stub
		Contact saved=contactRepository.save(ContactMapper.toEntity(contactDTO));
		return ContactMapper.toDTO(saved);
	}

	@Override
	public ContactDTO updateContact(Long id, ContactDTO contactDTO) {
		// TODO Auto-generated method stub
		Contact saved=contactRepository.findById(id).orElse(null);
		return ContactMapper.toDTO(saved);
		
	}

	@Override
	public void deleteContact(Long id) {
		// TODO Auto-generated method stub
contactRepository.deleteById(id);
	}

}
