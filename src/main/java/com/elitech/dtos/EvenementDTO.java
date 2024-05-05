package com.elitech.dtos;

import com.elitech.entities.Type;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class EvenementDTO {

    private Long id;
    @NotBlank
    private String date;
    @NotBlank
    private String lieu;
    @NotBlank
    private String description;
    @NotBlank
    private Type type;


}