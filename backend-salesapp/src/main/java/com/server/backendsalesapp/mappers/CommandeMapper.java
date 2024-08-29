package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.CommandeDTO;
import com.server.backendsalesapp.models.Commande;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CommandeMapper {
    CommandeMapper INSTANCE = Mappers.getMapper(CommandeMapper.class);

    CommandeDTO toDTO(Commande commande);

    List<CommandeDTO> toListDTO(List<Commande> commande);

    Commande toEntity(CommandeDTO commandeDTO);
}
