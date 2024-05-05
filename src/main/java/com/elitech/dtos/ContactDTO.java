package com.elitech.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDTO {

    private Long id;
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;
    @NotBlank
    @Size(min = 8,max = 16)
    private String telephone;
    @NotBlank
    private String adresse;

}
