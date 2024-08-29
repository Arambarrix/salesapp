package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.MagasinDTO;
import com.server.backendsalesapp.models.Magasin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MagasinMapper {
    MagasinMapper INSTANCE = Mappers.getMapper(MagasinMapper.class);

    MagasinDTO toDTO(Magasin magasin);

    List<MagasinDTO> toListDTO(List<Magasin> magasin);

    Magasin toEntity(MagasinDTO magasinDTO);
}
