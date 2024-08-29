package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Livraison {
    @Id
    private Integer id;
    @OneToOne
    private Commande commande;
    @ManyToOne
    private AdresseFacturation adresseFacturation;
    @ManyToOne
    private AdresseLivraison adresseLivraison;
    private LocalDate dateLivraison;

}
