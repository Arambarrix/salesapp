package com.server.backendsalesapp.services;

import java.util.List;

public interface AbstractService<T,ID> {
    public T findById(ID id);
    public List<T> findAll();
    public T save(T t);
    public T update(ID id, T t);
    public void deleteAll();
    public void deleteById(ID id);
}
