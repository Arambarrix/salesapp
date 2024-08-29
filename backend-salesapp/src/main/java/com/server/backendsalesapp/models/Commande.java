package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Commande {
    @Id
    private String numeroCommande;
    private LocalDate dateCommande;
    private Etat etat;
    @OneToMany
    private Set<LigneCommande> lignes;
    @OneToOne
    private Livraison livraison;
}
