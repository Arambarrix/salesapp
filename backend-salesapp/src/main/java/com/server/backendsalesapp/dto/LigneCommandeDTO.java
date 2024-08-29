package com.server.backendsalesapp.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LigneCommandeDTO {
    private Integer id;
    private ClientDTO client;
    private ProduitDTO produit;
    private CommandeDTO commande;
    private Double prixTotal;
    private Integer nombreProduits;
    private LocalDate dateAjout;
}
