package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.AdresseLivraisonDTO;
import com.server.backendsalesapp.models.AdresseLivraison;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AdresseLivraisonMapper {
    AdresseLivraisonMapper INSTANCE = Mappers.getMapper(AdresseLivraisonMapper.class);

    AdresseLivraisonDTO toDTO(AdresseLivraison adresseLivraison);

    List<AdresseLivraisonDTO> toListDTO(List<AdresseLivraison> adresseLivraison);

    AdresseLivraison toEntity(AdresseLivraisonDTO adresseLivraisonDTO);
}
