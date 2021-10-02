package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.entity.Monitor;
import ru.nsu.testtask.service.ProductService;

@RestController
@RequestMapping("/products/monitors")
public class MonitorController extends ProductController<Monitor>{
    public MonitorController(ProductService<Monitor> productService) {
        super(productService);
    }
}
