package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.ClientDTO;
import com.server.backendsalesapp.models.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDTO toDTO(Client client);

    List<ClientDTO> toListDTO(List<Client> client);

    Client toEntity(ClientDTO clientDTO);
}
