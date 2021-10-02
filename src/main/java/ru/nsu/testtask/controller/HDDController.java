package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.service.ProductService;

@RestController
@RequestMapping("/products/hdds")
public class HDDController extends ProductController<HDD> {
    public HDDController(ProductService<HDD> productService) {
        super(productService);
    }
}
