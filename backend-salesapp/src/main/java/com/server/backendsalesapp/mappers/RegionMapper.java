package com.server.backendsalesapp.mappers;

import com.server.backendsalesapp.dto.RegionDTO;
import com.server.backendsalesapp.models.Region;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RegionMapper {
    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);

    RegionDTO toDTO(Region region);

    List<RegionDTO> toListDTO(List<Region> regions);

    Region toEntity(RegionDTO regionDTO);
}
