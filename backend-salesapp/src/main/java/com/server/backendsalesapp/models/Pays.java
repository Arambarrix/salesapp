package com.server.backendsalesapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Pays {
    @Id
    private Integer id;
    private String libelle;
    private String sigle;
    @OneToMany
    private Set<Region> regions;
}
