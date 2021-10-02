package ru.nsu.testtask.service;

import ru.nsu.testtask.data.entity.Product;

import java.util.Optional;

public interface CrudService <E extends Product>{

    void add(E entity);
    void delete(int id);
    void update(E entity);
    Optional<E> getById(int id);

}
