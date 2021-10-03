package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.dto.LaptopDTO;
import ru.nsu.testtask.data.entity.Laptop;
import ru.nsu.testtask.mapper.AbstractMapper;
import ru.nsu.testtask.service.CrudService;

@RestController
@RequestMapping("/products/laptops")
public class LaptopController extends AbstractController<Laptop, LaptopDTO> {
    public LaptopController(CrudService<Laptop> service, AbstractMapper<Laptop, LaptopDTO> abstractMapper) {
        super(service, abstractMapper);
    }
}
