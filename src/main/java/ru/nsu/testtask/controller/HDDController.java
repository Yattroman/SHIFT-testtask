package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.dto.DesktopComputerDTO;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.entity.DesktopComputer;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.mapper.Mapper;
import ru.nsu.testtask.service.ProductService;

@RestController
@RequestMapping("/products/hdds")
public class HDDController extends AbstractController<HDD, HDDDTO> {
    public HDDController(ProductService<HDD> productService, Mapper<HDD, HDDDTO> mapper) {
        super(productService, mapper);
    }
}
