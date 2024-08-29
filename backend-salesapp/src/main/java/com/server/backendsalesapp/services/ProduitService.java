package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService implements AbstractService<Produit, Integer> {
    @Override
    public Produit findById(Integer integer) {
        return null;
    }

    @Override
    public List<Produit> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return null;
    }

    @Override
    public Produit save(Produit produit) {
        return null;
    }

    @Override
    public Produit update(Integer integer, Produit produit) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
