package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employe {
    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private LocalDate dateEntree;
    private LocalDate dateSortie;
    @OneToOne
    private CompteEmploye compteEmploye;
}
