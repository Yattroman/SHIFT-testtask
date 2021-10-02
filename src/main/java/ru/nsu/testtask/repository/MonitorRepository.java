package ru.nsu.testtask.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import ru.nsu.testtask.data.entity.Monitor;

@Repository
@Qualifier("monitorRepository")
public interface MonitorRepository extends ProductRepository<Monitor, Integer> {
}
