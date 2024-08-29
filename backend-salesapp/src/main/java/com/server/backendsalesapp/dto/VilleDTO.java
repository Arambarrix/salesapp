package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class VilleDTO {
    private Integer id;
    private String libelle;
    private Double longitude;
    private Double latitude;
    private RegionDTO region;
}
