package com.server.backendsalesapp.services;

import java.util.List;

public interface AbstractService<T, ID> {
    T findById(ID id);

    List<T> findAll(Integer nombreLimite, Integer nombrePages);

    List<T> findAll();

    T save(T t);

    T update(ID id, T t);

    void deleteAll();

    void deleteById(ID id);
}
