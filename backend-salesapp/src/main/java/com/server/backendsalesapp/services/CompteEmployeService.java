package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.CompteEmploye;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteEmployeService implements AbstractService<CompteEmploye, Integer> {
    @Override
    public CompteEmploye findById(Integer integer) {
        return null;
    }

    @Override
    public List<CompteEmploye> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<CompteEmploye> findAll() {
        return null;
    }

    @Override
    public CompteEmploye save(CompteEmploye compteEmploye) {
        return null;
    }

    @Override
    public CompteEmploye update(Integer integer, CompteEmploye compteEmploye) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
