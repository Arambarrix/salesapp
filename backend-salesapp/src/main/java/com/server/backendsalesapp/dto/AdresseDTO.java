package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class AdresseDTO {
    private Integer id;
    private Integer numero;
    private String rue;
    private Integer codePostal;
    private String supplement;
    private VilleDTO ville;
}
