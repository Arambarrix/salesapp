package com.server.backendsalesapp.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NotationDTO {
    private Integer id;
    private ClientDTO client;
    private ProduitDTO produit;
    private Double note;
    private LocalDate dateNotation;
}
