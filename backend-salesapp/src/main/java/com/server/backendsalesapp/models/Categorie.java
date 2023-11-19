package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Categorie {
    @Id
    private Integer id;
    private String libelle;
    @ManyToOne
    private Catalogue catalogue;
    @OneToMany
    private List<Produit> produits;
}
