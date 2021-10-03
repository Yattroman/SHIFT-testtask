package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.mapper.AbstractMapper;
import ru.nsu.testtask.service.CrudService;

@RestController
@RequestMapping("/products/hdds")
public class HDDController extends AbstractController<HDD, HDDDTO> {
    public HDDController(CrudService<HDD> service, AbstractMapper<HDD, HDDDTO> abstractMapper) {
        super(service, abstractMapper);
    }
}
