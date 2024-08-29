package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService implements AbstractService<Categorie, Integer> {
    @Override
    public Categorie findById(Integer integer) {
        return null;
    }

    @Override
    public List<Categorie> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Categorie> findAll() {
        return null;
    }

    @Override
    public Categorie save(Categorie categorie) {
        return null;
    }

    @Override
    public Categorie update(Integer integer, Categorie categorie) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
