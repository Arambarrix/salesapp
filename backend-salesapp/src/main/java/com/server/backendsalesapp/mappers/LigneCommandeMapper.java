package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.LigneCommandeDTO;
import com.server.backendsalesapp.models.LigneCommande;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LigneCommandeMapper {
    LigneCommandeMapper INSTANCE = Mappers.getMapper(LigneCommandeMapper.class);

    LigneCommandeDTO toDTO(LigneCommande ligneCommande);

    List<LigneCommandeDTO> toListDTO(List<LigneCommande> ligneCommande);

    LigneCommande toEntity(LigneCommandeDTO ligneCommandeDTO);
}
