package com.server.backendsalesapp.dto;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LivraisonDTO {
    private Integer id;
    @OneToOne
    private CommandeDTO commande;
    @ManyToOne
    private AdresseFacturationDTO adresseFacturation;
    @ManyToOne
    private AdresseLivraisonDTO adresseLivraison;
    private LocalDate dateLivraison;
}
