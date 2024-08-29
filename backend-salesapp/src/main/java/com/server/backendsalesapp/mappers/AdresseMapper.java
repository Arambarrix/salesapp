package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.AdresseDTO;
import com.server.backendsalesapp.models.Adresse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AdresseMapper {
    AdresseMapper INSTANCE = Mappers.getMapper(AdresseMapper.class);

    AdresseDTO toDTO(Adresse adresse);

    List<AdresseDTO> toListDTO(List<Adresse> adresse);

    Adresse toEntity(AdresseDTO adresseDTO);
}
