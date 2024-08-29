package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class AdresseLivraison extends Adresse {
    private String nomDestinataire;
    private String prenomDestinataire;
    @OneToMany
    private List<Livraison> livraisons;
}
