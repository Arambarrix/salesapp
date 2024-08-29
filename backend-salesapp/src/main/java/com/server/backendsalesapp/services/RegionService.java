package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Region;
import com.server.backendsalesapp.repositories.RegionRepository;
import com.server.backendsalesapp.utilities.Constants;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegionService implements AbstractService<Region, Integer> {
    private final RegionRepository regionRepository;

    @Override
    public Region findById(Integer id) {
        return regionRepository.findById(id).orElseThrow(()->new RuntimeException("Aucune donnée"));
    }

    @Override
    public List<Region> findAll(Integer nombreLimite, Integer nombrePages) {
        if (nombrePages == null) {
            nombrePages = 0;
        } else if (nombrePages < 0) {
            throw new IllegalArgumentException(Constants.PAGENUMBER);
        }
        if (nombreLimite == null) {
            nombreLimite = 10;
        } else if (nombreLimite <= 0) {
            throw new IllegalArgumentException(Constants.LIMITNUMBER);
        }
        return regionRepository.findAll(PageRequest.of(nombrePages, nombreLimite)).getContent();
    }

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region update(Integer id, Region region) {
        Region toUpdate = regionRepository.findById(id).orElseThrow(()->new RuntimeException("Aucune donnée"));
        toUpdate.setLibelle(region.getLibelle());
        toUpdate.setPays(region.getPays());
        return regionRepository.save(toUpdate);
    }

    @Override
    public void deleteAll() {
        regionRepository.deleteAll();
    }

    @Override
    public void deleteById(Integer id) {
        regionRepository.deleteById(id);
    }
}
