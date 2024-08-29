package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.CatalogueDTO;
import com.server.backendsalesapp.models.Catalogue;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CatalogueMapper {
    CatalogueMapper INSTANCE = Mappers.getMapper(CatalogueMapper.class);

    CatalogueDTO toDTO(Catalogue catalogue);

    List<CatalogueDTO> toListDTO(List<Catalogue> catalogues);

    Catalogue toEntity(CatalogueDTO catalogueDTO);
}
