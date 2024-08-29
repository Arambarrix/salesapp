package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.CompteEmployeDTO;
import com.server.backendsalesapp.models.CompteEmploye;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CompteEmployeMapper {
    CompteEmployeMapper INSTANCE = Mappers.getMapper(CompteEmployeMapper.class);

    CompteEmployeDTO toDTO(CompteEmploye compteEmploye);

    List<CompteEmployeDTO> toListDTO(List<CompteEmploye> compteEmploye);

    CompteEmploye toEntity(CompteEmployeDTO compteEmployeDTO);
}
