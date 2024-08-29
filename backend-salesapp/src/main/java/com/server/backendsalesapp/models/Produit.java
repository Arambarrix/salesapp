package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Getter
@Setter
public class Produit {
    @Id
    private Integer id;
    private String libelle;
    private String description;
    private Double prixReference;
    private Double note;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Categorie categorie;
    @OneToMany
    private List<Stockage> stockages;
    @OneToMany
    private List<LigneCommande> lignes;
}
