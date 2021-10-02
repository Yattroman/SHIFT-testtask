package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.dto.DesktopComputerDTO;
import ru.nsu.testtask.data.dto.MonitorDTO;
import ru.nsu.testtask.data.entity.DesktopComputer;
import ru.nsu.testtask.data.entity.Monitor;
import ru.nsu.testtask.mapper.Mapper;
import ru.nsu.testtask.service.ProductService;

@RestController
@RequestMapping("/products/monitors")
public class MonitorController extends AbstractController<Monitor, MonitorDTO>{
    public MonitorController(ProductService<Monitor> productService, Mapper<Monitor, MonitorDTO> mapper) {
        super(productService, mapper);
    }
}
