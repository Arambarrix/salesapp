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
public class Adresse {
    @Id
    private Integer id;
    private Integer numero;
    private String rue;
    private Integer codePostal;
    private String supplement;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Ville ville;
    @OneToMany
    private List<AdresseFacturation> facturations;
    @OneToMany
    private List<Magasin> magasins;
}
