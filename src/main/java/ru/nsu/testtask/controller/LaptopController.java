package ru.nsu.testtask.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.dto.LaptopDTO;
import ru.nsu.testtask.data.entity.DesktopComputer;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.data.entity.Laptop;
import ru.nsu.testtask.data.enums.ProductType;
import ru.nsu.testtask.mapper.AbstractMapper;
import ru.nsu.testtask.service.CrudService;
import ru.nsu.testtask.service.DesktopComputerService;
import ru.nsu.testtask.service.LaptopService;

import java.util.List;

@RestController
@RequestMapping("/products/laptops")
public class LaptopController extends AbstractController<Laptop, LaptopDTO> {
    public LaptopController(CrudService<Laptop> service, AbstractMapper<Laptop, LaptopDTO> abstractMapper) {
        super(service, abstractMapper);
    }

    @GetMapping
    private ResponseEntity<List<Laptop>> getByType(){
        LaptopService service = (LaptopService) getService();
        return new ResponseEntity<>(service.findAllByType(ProductType.LAPTOP), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    private ResponseEntity<LaptopDTO> update(@PathVariable("id") int id, @RequestBody LaptopDTO dto) {

        var LaptopData = getService().getById(id);
        if(LaptopData.isPresent()){
            Laptop laptop = LaptopData.get();
            laptop.setName(dto.getName());
            laptop.setPrice(dto.getPrice());
            laptop.setStockQuantity(dto.getStockQuantity());
            laptop.setProductType(dto.getProductType());
            laptop.setDiagonal(dto.getDiagonal());
            getService().update(laptop);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
