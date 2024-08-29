package com.server.backendsalesapp.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AdresseLivraisonDTO extends AdresseDTO {
    private String nomDestinataire;
    private String prenomDestinataire;
}
