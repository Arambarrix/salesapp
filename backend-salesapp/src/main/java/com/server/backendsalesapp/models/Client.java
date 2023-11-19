package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Client {
    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String dateNaissance;
    @OneToOne
    private CompteClient compteClient;
    @OneToMany
    private List<AdresseFacturation> facturations;
    @OneToMany
    private List<LigneCommande> lignes;
}
