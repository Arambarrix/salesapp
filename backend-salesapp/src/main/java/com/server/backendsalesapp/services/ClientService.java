package com.server.backendsalesapp.services;

import com.server.backendsalesapp.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements AbstractService<Client, Integer> {
    @Override
    public Client findById(Integer integer) {
        return null;
    }

    @Override
    public List<Client> findAll(Integer nombreLimite, Integer nombrePages) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Client update(Integer integer, Client client) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
