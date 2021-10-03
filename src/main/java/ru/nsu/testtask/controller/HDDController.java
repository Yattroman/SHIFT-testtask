package ru.nsu.testtask.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.data.enums.ProductType;
import ru.nsu.testtask.mapper.AbstractMapper;
import ru.nsu.testtask.service.CrudService;
import ru.nsu.testtask.service.HDDService;
import ru.nsu.testtask.service.HDDService;

import java.util.List;

@RestController
@RequestMapping("/products/hdds")
public class HDDController extends AbstractController<HDD, HDDDTO> {
    public HDDController(CrudService<HDD> service, AbstractMapper<HDD, HDDDTO> abstractMapper) {
        super(service, abstractMapper);
    }

    @GetMapping
    private ResponseEntity<List<HDD>> getByType(){
        HDDService service = (HDDService) getService();
        return new ResponseEntity<>(service.findAllByType(ProductType.HDD), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    private ResponseEntity<HDDDTO> update(@PathVariable("id") int id, @RequestBody HDDDTO dto) {

        var HDDData = getService().getById(id);
        if(HDDData.isPresent()){
            HDD hdd = HDDData.get();
            hdd.setName(dto.getName());
            hdd.setPrice(dto.getPrice());
            hdd.setStockQuantity(dto.getStockQuantity());
            hdd.setProductType(dto.getProductType());
            hdd.setVolume(dto.getVolume());
            getService().update(hdd);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
