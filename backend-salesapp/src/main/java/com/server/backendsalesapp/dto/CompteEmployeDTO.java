package com.server.backendsalesapp.dto;

import com.server.backendsalesapp.models.Role;
import lombok.Data;

@Data
public class CompteEmployeDTO {
    private Integer id;
    private String pseudo;
    private String motDePasse;
    private Role role;
}
