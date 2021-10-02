package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.entity.Laptop;
import ru.nsu.testtask.service.ProductService;

@RestController
@RequestMapping("/products/laptops")
public class LaptopController extends ProductController<Laptop> {
    public LaptopController(ProductService<Laptop> productService) {
        super(productService);
    }
}
