package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.PaysDTO;
import com.server.backendsalesapp.models.Pays;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PaysMapper {
    PaysMapper INSTANCE = Mappers.getMapper(PaysMapper.class);

    PaysDTO toDTO(Pays pays);

    List<PaysDTO> toListDTO(List<Pays> pays);

    Pays toEntity(PaysDTO paysDTO);
}
