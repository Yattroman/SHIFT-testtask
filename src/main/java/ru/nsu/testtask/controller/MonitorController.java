package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.dto.MonitorDTO;
import ru.nsu.testtask.data.entity.Monitor;
import ru.nsu.testtask.mapper.AbstractMapper;
import ru.nsu.testtask.service.CrudService;

@RestController
@RequestMapping("/products/monitors")
public class MonitorController extends AbstractController<Monitor, MonitorDTO>{
    public MonitorController(CrudService<Monitor> service, AbstractMapper<Monitor, MonitorDTO> abstractMapper) {
        super(service, abstractMapper);
    }
}
