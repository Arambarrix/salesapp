package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Employe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService implements AbstractService<Employe, Integer> {
    @Override
    public Employe findById(Integer integer) {
        return null;
    }

    @Override
    public List<Employe> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Employe> findAll() {
        return null;
    }

    @Override
    public Employe save(Employe employe) {
        return null;
    }

    @Override
    public Employe update(Integer integer, Employe employe) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
