package com.server.backendsalesapp.dto;

import com.server.backendsalesapp.models.Etat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CommandeDTO {
    private String numeroCommande;
    private LocalDate dateCommande;
    private Etat etat;
}
