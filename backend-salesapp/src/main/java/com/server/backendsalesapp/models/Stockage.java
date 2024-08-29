package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Stockage {
    @Id
    private Integer id;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Magasin magasin;
    private Double prixActuel;
    private LocalDate dateEntree;
    private LocalDate dateSortie;
    private Integer quantite;

}
