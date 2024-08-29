package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompteEmploye {
    @Id
    private Integer id;
    private String pseudo;
    private String motDePasse;
    private Role role;
    @OneToOne
    private Employe employe;
}
