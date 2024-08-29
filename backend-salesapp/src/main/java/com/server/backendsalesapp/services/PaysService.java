package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Pays;
import com.server.backendsalesapp.repositories.PaysRepository;
import com.server.backendsalesapp.utilities.Constants;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaysService implements AbstractService<Pays, Integer> {
    private final PaysRepository paysRepository;

    @Override
    public Pays findById(Integer id) {
        return paysRepository.findById(id).orElseThrow(() -> new RuntimeException("Aucune donnée"));
    }

    @Override
    public List<Pays> findAll(Integer nombreLimite, Integer nombrePages) {
        if (nombrePages == null) {
            nombrePages = 0;
        } else if (nombrePages < 0) {
            throw new IllegalArgumentException(Constants.PAGENUMBER);
        }
        if (nombreLimite == null) {
            nombreLimite = 10;
        } else if (nombreLimite <= 0) {
            throw new IllegalArgumentException(Constants.LIMITNUMBER);
        }
        return paysRepository.findAll(PageRequest.of(nombrePages, nombreLimite)).getContent();
    }

    @Override
    public List<Pays> findAll() {
        return paysRepository.findAll();
    }

    @Override
    public Pays save(Pays pays) {
        return paysRepository.save(pays);
    }

    @Override
    public Pays update(Integer id, Pays pays) {
        Pays toUpdate = paysRepository.findById(id).orElseThrow(() -> new RuntimeException("Aucune donnée"));
        toUpdate.setLibelle(pays.getLibelle());
        toUpdate.setSigle(pays.getSigle());
        return paysRepository.save(toUpdate);
    }

    @Override
    public void deleteAll() {
        paysRepository.deleteAll();
    }

    @Override
    public void deleteById(Integer id) {
        paysRepository.deleteById(id);
    }
}
