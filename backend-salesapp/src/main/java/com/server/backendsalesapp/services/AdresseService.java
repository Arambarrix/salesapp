package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Adresse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService implements AbstractService<Adresse, Integer> {
    @Override
    public Adresse findById(Integer integer) {
        return null;
    }

    @Override
    public List<Adresse> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Adresse> findAll() {
        return null;
    }

    @Override
    public Adresse save(Adresse adresse) {
        return null;
    }

    @Override
    public Adresse update(Integer integer, Adresse adresse) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
