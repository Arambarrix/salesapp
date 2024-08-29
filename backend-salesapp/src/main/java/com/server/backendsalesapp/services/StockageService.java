package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Stockage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockageService implements AbstractService<Stockage, Integer> {
    @Override
    public Stockage findById(Integer integer) {
        return null;
    }

    @Override
    public List<Stockage> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Stockage> findAll() {
        return null;
    }

    @Override
    public Stockage save(Stockage stockage) {
        return null;
    }

    @Override
    public Stockage update(Integer integer, Stockage stockage) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
