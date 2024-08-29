package com.server.backendsalesapp.dto;

import lombok.Data;

@Data
public class CompteClientDTO {
    private Integer id;
    private String pseudo;
    private String motDePasse;
}
