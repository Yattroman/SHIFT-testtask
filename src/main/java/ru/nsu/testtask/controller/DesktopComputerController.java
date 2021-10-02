package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.entity.DesktopComputer;
import ru.nsu.testtask.service.ProductService;

@RestController
@RequestMapping("/products/desktopComputers")
public class DesktopComputerController extends ProductController<DesktopComputer> {
    public DesktopComputerController(ProductService<DesktopComputer> productService) {
        super(productService);
    }
}
