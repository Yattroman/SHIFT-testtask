package ru.nsu.testtask.service;

import org.springframework.stereotype.Service;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.repository.HDDRepository;

@Service
public class HDDService extends AbstractCrudService<HDD>{
    public HDDService(HDDRepository repository) {
        super(repository);
    }
}
