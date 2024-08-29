package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.LivraisonDTO;
import com.server.backendsalesapp.models.Livraison;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LivraisonMapper {
    LivraisonMapper INSTANCE = Mappers.getMapper(LivraisonMapper.class);

    LivraisonDTO toDTO(Livraison livraison);

    List<LivraisonDTO> toListDTO(List<Livraison> livraison);

    Livraison toEntity(LivraisonDTO livraisonDTO);
}
