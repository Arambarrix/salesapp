package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class CategorieDTO {
    private Integer id;
    private String libelle;
    private CatalogueDTO catalogue;
}
