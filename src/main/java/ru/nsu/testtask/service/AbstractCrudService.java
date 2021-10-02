package ru.nsu.testtask.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nsu.testtask.data.entity.Product;
import ru.nsu.testtask.exception.ProductNotFoundException;
import ru.nsu.testtask.repository.AbstractRepository;
import ru.nsu.testtask.repository.ProductRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public abstract class AbstractCrudService<E extends Product> implements CrudService<E> {

    private final AbstractRepository<E, Integer> repository;

    @Override
    public void add(E entity) {
        repository.save(entity);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(E entity) {
        repository.save(entity);
    }

    @Override
    public Optional<E> getById(int id) { return Optional.of(repository.getById(id)); }

}
