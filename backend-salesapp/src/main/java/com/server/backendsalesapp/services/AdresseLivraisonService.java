package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.AdresseLivraison;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseLivraisonService implements AbstractService<AdresseLivraison, Integer> {
    @Override
    public AdresseLivraison findById(Integer integer) {
        return null;
    }

    @Override
    public List<AdresseLivraison> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<AdresseLivraison> findAll() {
        return null;
    }

    @Override
    public AdresseLivraison save(AdresseLivraison adresseLivraison) {
        return null;
    }

    @Override
    public AdresseLivraison update(Integer integer, AdresseLivraison adresseLivraison) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
