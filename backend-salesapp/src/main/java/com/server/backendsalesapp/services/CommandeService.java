package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Commande;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService implements AbstractService<Commande, Integer> {
    @Override
    public Commande findById(Integer integer) {
        return null;
    }

    @Override
    public List<Commande> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Commande> findAll() {
        return null;
    }

    @Override
    public Commande save(Commande commande) {
        return null;
    }

    @Override
    public Commande update(Integer integer, Commande commande) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
