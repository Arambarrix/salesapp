package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.EmployeDTO;
import com.server.backendsalesapp.models.Employe;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeMapper {
    EmployeMapper INSTANCE = Mappers.getMapper(EmployeMapper.class);

    EmployeDTO toDTO(Employe employe);

    List<EmployeDTO> toListDTO(List<Employe> employe);

    Employe toEntity(EmployeDTO employeDTO);
}
