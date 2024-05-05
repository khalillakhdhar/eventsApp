package com.elitech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {

}
