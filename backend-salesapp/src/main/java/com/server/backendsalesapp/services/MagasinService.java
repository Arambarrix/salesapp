package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Magasin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagasinService implements AbstractService<Magasin, Integer> {
    @Override
    public Magasin findById(Integer integer) {
        return null;
    }

    @Override
    public List<Magasin> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Magasin> findAll() {
        return null;
    }

    @Override
    public Magasin save(Magasin magasin) {
        return null;
    }

    @Override
    public Magasin update(Integer integer, Magasin magasin) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
