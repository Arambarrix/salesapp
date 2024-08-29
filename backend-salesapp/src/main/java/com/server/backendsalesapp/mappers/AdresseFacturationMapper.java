package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.AdresseFacturationDTO;
import com.server.backendsalesapp.models.AdresseFacturation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AdresseFacturationMapper {
    AdresseFacturationMapper INSTANCE = Mappers.getMapper(AdresseFacturationMapper.class);

    AdresseFacturationDTO toDTO(AdresseFacturation adresseFacturation);

    List<AdresseFacturationDTO> toListDTO(List<AdresseFacturation> adresseFacturation);

    AdresseFacturation toEntity(AdresseFacturationDTO adresseFacturationDTO);
}
