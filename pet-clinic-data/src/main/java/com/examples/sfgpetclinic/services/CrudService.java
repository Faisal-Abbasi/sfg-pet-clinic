package com.examples.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T Objects);
    void delete( T Object);
    void deleteById(ID id);
}
