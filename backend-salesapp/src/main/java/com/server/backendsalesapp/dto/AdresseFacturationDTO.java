package com.server.backendsalesapp.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AdresseFacturationDTO {
    private Integer id;
    private ClientDTO client;
    private AdresseDTO adresse;
    private LocalDate dateFacturation;
}
