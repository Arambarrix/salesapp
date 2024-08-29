package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class RegionDTO {
    private Integer id;
    private String libelle;
    private PaysDTO pays;
}
