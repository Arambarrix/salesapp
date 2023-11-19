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
public class Magasin {
    @Id
    private Integer id;
    private String libelle;
    @ManyToOne
    private Adresse adresse;
    @OneToMany
    private List<Employe> employes;
    @OneToMany
    private List<Stockage> stockages;
}
