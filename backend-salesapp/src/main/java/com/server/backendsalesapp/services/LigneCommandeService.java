package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.LigneCommande;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCommandeService implements AbstractService<LigneCommande, Integer> {
    @Override
    public LigneCommande findById(Integer integer) {
        return null;
    }

    @Override
    public List<LigneCommande> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<LigneCommande> findAll() {
        return null;
    }

    @Override
    public LigneCommande save(LigneCommande ligneCommande) {
        return null;
    }

    @Override
    public LigneCommande update(Integer integer, LigneCommande ligneCommande) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
