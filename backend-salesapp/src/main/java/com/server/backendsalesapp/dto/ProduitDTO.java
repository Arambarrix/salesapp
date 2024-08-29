package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class ProduitDTO {
    private Integer id;
    private String libelle;
    private String description;
    private Double prixReference;
    private Double note;
    private CategorieDTO categorie;
}
