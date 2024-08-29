package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Catalogue {
    @Id
    private Integer id;
    private String libelle;
    @OneToMany
    private List<Categorie> categories;
}
