package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Ville;
import com.server.backendsalesapp.repositories.VilleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VilleService implements AbstractService<Ville, Integer> {
    private final VilleRepository villeRepository;

    @Override
    public Ville findById(Integer integer) {
        return villeRepository.findById(integer).orElseThrow(() -> new RuntimeException("Aucune donnée"));
    }

    @Override
    public List<Ville> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Ville> findAll() {
        return null;
    }

    @Override
    public Ville save(Ville ville) {
        return null;
    }

    @Override
    public Ville update(Integer integer, Ville ville) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
