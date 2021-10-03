package ru.nsu.testtask.service;

import org.springframework.stereotype.Service;
import ru.nsu.testtask.data.entity.Monitor;
import ru.nsu.testtask.repository.MonitorRepository;

@Service
public class MonitorService extends AbstractCrudService<Monitor>{
    public MonitorService(MonitorRepository repository) {
        super(repository);
    }
}
