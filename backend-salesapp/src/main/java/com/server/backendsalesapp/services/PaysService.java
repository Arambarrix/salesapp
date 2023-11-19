package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Pays;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaysService implements AbstractService<Pays,Integer> {
    @Override
    public Pays findById(Integer integer) {
        return null;
    }

    @Override
    public List<Pays> findAll() {
        return null;
    }

    @Override
    public Pays save(Pays pays) {
        return null;
    }

    @Override
    public Pays update(Integer integer, Pays pays) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
