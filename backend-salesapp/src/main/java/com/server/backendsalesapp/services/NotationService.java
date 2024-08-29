package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Notation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotationService implements AbstractService<Notation, Integer> {
    @Override
    public Notation findById(Integer integer) {
        return null;
    }

    @Override
    public List<Notation> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Notation> findAll() {
        return null;
    }

    @Override
    public Notation save(Notation notation) {
        return null;
    }

    @Override
    public Notation update(Integer integer, Notation notation) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
