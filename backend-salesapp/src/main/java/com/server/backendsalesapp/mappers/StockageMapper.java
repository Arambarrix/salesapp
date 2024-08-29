package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.StockageDTO;
import com.server.backendsalesapp.models.Stockage;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StockageMapper {
    StockageMapper INSTANCE = Mappers.getMapper(StockageMapper.class);

    StockageDTO toDTO(Stockage stockage);

    List<StockageDTO> toListDTO(List<Stockage> stockage);

    Stockage toEntity(StockageDTO stockageDTO);
}
