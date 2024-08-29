package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Set;

@Entity
@Getter
@Setter
public class Region {
    @Id
    private Integer id;
    private String libelle;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pays pays;

    @OneToMany
    private Set<Ville> villes;
}
