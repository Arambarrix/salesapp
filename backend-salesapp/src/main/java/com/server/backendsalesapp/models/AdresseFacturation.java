package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class AdresseFacturation {
    @Id
    private Integer id;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Client client;
    @ManyToOne
    private Adresse adresse;
    private LocalDate dateFacturation;
    @OneToMany
    private List<Livraison> livraisons;
}
