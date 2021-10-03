package ru.nsu.testtask.service;

import org.springframework.stereotype.Service;
import ru.nsu.testtask.data.entity.Laptop;
import ru.nsu.testtask.repository.LaptopRepository;

@Service
public class LaptopService extends AbstractCrudService<Laptop>{
    public LaptopService(LaptopRepository repository) {
        super(repository);
    }
}
