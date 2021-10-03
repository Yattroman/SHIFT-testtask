package ru.nsu.testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.testtask.data.dto.DesktopComputerDTO;
import ru.nsu.testtask.data.entity.DesktopComputer;
import ru.nsu.testtask.mapper.AbstractMapper;
import ru.nsu.testtask.service.CrudService;

@RestController
@RequestMapping("/products/desktopComputers")
public class DesktopComputerController extends AbstractController<DesktopComputer, DesktopComputerDTO> {
    public DesktopComputerController(CrudService<DesktopComputer> service, AbstractMapper<DesktopComputer, DesktopComputerDTO> abstractMapper) {
        super(service, abstractMapper);
    }
}
