package ru.nsu.testtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractRepository<E, Integer> extends JpaRepository<E, Integer> {
}
