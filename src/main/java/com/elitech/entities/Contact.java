package com.elitech.entities;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;




@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Contact extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
    private String nom;
	@Column(nullable = false)
    private String prenom;
    @Column(unique = true)
    private String telephone;
    @Column(nullable = false)
    private String adresse;

}
