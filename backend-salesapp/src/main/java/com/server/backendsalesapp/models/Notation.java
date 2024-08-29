package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Notation {
    @Id
    private Integer id;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Produit produit;
    private Double note;
    private LocalDate dateNotation;
}
