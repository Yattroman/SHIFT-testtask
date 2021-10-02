package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.dto.DesktopComputerDTO;
import ru.nsu.testtask.data.dto.LaptopDTO;
import ru.nsu.testtask.data.entity.DesktopComputer;
import ru.nsu.testtask.data.entity.Laptop;
import ru.nsu.testtask.mapper.Mapper;
import ru.nsu.testtask.service.ProductService;

@RestController
@RequestMapping("/products/laptops")
public class LaptopController extends AbstractController<Laptop, LaptopDTO> {
    public LaptopController(ProductService<Laptop> productService, Mapper<Laptop, LaptopDTO> mapper) {
        super(productService, mapper);
    }
}
