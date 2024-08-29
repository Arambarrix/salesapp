package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.CompteClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteClientService implements AbstractService<CompteClient, Integer> {
    @Override
    public CompteClient findById(Integer integer) {
        return null;
    }

    @Override
    public List<CompteClient> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<CompteClient> findAll() {
        return null;
    }

    @Override
    public CompteClient save(CompteClient compteClient) {
        return null;
    }

    @Override
    public CompteClient update(Integer integer, CompteClient compteClient) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
