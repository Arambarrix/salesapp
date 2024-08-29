package com.server.backendsalesapp.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeDTO {
    private Integer id;
    private String nom;
    private String prenom;
    private LocalDate dateEntree;
    private LocalDate dateSortie;
    private CompteEmployeDTO compteEmploye;
}
