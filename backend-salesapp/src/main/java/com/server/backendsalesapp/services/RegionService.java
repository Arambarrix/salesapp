package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Region;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegionService implements AbstractService<Region,Integer>{
    @Override
    public Region findById(Integer integer) {
        return null;
    }

    @Override
    public List<Region> findAll() {
        return null;
    }

    @Override
    public Region save(Region region) {
        return null;
    }

    @Override
    public Region update(Integer integer, Region region) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
