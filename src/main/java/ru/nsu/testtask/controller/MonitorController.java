package ru.nsu.testtask.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.testtask.data.dto.DesktopComputerDTO;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.dto.MonitorDTO;
import ru.nsu.testtask.data.entity.DesktopComputer;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.data.entity.Monitor;
import ru.nsu.testtask.data.enums.ProductType;
import ru.nsu.testtask.mapper.AbstractMapper;
import ru.nsu.testtask.service.CrudService;
import ru.nsu.testtask.service.DesktopComputerService;
import ru.nsu.testtask.service.MonitorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products/monitors")
public class MonitorController extends AbstractController<Monitor, MonitorDTO>{
    public MonitorController(CrudService<Monitor> service, AbstractMapper<Monitor, MonitorDTO> abstractMapper) {
        super(service, abstractMapper);
    }

    @GetMapping
    private ResponseEntity<List<MonitorDTO>> getByType(){
        MonitorService service = (MonitorService) getService();
        List<MonitorDTO> dtoList = service.findAllByType(ProductType.MONITOR).stream().map((e) -> getAbstractMapper().toDTO(e)).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    private ResponseEntity<MonitorDTO> update(@PathVariable("id") int id, @RequestBody MonitorDTO dto) {

        var MonitorData = getService().getById(id);
        if(MonitorData.isPresent()){
            Monitor monitor = MonitorData.get();
            monitor.setName(dto.getName());
            monitor.setPrice(dto.getPrice());
            monitor.setStockQuantity(dto.getStockQuantity());
            monitor.setProductType(dto.getProductType());
            monitor.setDiagonal(dto.getDiagonal());
            getService().update(monitor);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
