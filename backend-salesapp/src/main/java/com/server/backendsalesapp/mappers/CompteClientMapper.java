package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.CompteClientDTO;
import com.server.backendsalesapp.models.CompteClient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CompteClientMapper {
    CompteClientMapper INSTANCE = Mappers.getMapper(CompteClientMapper.class);

    CompteClientDTO toDTO(CompteClient compteClient);

    List<CompteClientDTO> toListDTO(List<CompteClient> compteClient);

    CompteClient toEntity(CompteClientDTO compteClientDTO);
}
