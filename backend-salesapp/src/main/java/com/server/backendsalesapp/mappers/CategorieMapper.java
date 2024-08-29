package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.CategorieDTO;
import com.server.backendsalesapp.models.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategorieMapper {
    CategorieMapper INSTANCE = Mappers.getMapper(CategorieMapper.class);

    CategorieDTO toDTO(Categorie categorie);

    List<CategorieDTO> toListDTO(List<Categorie> categories);

    Categorie toEntity(CategorieDTO categorieDTO);
}
