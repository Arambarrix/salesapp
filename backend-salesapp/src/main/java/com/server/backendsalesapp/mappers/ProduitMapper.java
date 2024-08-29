package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.ProduitDTO;
import com.server.backendsalesapp.models.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProduitMapper {
    ProduitMapper INSTANCE = Mappers.getMapper(ProduitMapper.class);

    ProduitDTO toDTO(Produit produit);

    List<ProduitDTO> toListDTO(List<Produit> produits);

    Produit toEntity(ProduitDTO produitDTO);
}
