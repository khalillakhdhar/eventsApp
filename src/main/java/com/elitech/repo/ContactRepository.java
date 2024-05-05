package com.elitech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
