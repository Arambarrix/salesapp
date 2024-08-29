package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class MagasinDTO {
    private Integer id;
    private String libelle;
    private AdresseDTO adresse;
}
