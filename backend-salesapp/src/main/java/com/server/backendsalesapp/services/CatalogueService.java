package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Catalogue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogueService implements AbstractService<Catalogue, Integer> {
    @Override
    public Catalogue findById(Integer integer) {
        return null;
    }

    @Override
    public List<Catalogue> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Catalogue> findAll() {
        return null;
    }

    @Override
    public Catalogue save(Catalogue catalogue) {
        return null;
    }

    @Override
    public Catalogue update(Integer integer, Catalogue catalogue) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
