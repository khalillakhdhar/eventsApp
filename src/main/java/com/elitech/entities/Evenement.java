package com.elitech.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = false)

@Data
public class Evenement extends BaseEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String date;
    private String lieu;
    private String description;
    @Enumerated(EnumType.STRING)
    private Type type;

}