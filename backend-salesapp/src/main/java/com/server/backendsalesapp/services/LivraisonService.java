package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Livraison;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivraisonService implements AbstractService<Livraison, Integer> {
    @Override
    public Livraison findById(Integer integer) {
        return null;
    }

    @Override
    public List<Livraison> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Livraison> findAll() {
        return null;
    }

    @Override
    public Livraison save(Livraison livraison) {
        return null;
    }

    @Override
    public Livraison update(Integer integer, Livraison livraison) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
