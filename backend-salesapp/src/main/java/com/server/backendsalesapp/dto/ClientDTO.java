package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class ClientDTO {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String dateNaissance;
    private CompteClientDTO compteClient;
}
