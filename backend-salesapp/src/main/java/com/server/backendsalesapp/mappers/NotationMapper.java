package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.NotationDTO;
import com.server.backendsalesapp.models.Notation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NotationMapper {
    NotationMapper INSTANCE = Mappers.getMapper(NotationMapper.class);

    NotationDTO toDTO(Notation notation);

    List<NotationDTO> toListDTO(List<Notation> notation);

    Notation toEntity(NotationDTO notationDTO);
}
