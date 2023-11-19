package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompteClient {
    @Id
    private Integer id;
    private String pseudo;
    private String motDePasse;
    @OneToOne
    private Client client;
}
