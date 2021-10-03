package ru.nsu.testtask.mapper;

import org.springframework.stereotype.Component;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.dto.LaptopDTO;
import ru.nsu.testtask.data.entity.HDD;
import ru.nsu.testtask.data.entity.Laptop;

@Component
public class HDDMapper implements AbstractMapper<HDD, HDDDTO> {

    @Override
    public HDD toEntity(HDDDTO dto){
        HDD hdd = new HDD();
        hdd.setName(dto.getName());
        hdd.setPrice(dto.getPrice());
        hdd.setStockQuantity(dto.getStockQuantity());
        hdd.setVolume(dto.getVolume());

        if(dto.getId() != null){
            hdd.setId(dto.getId());
        }

        return hdd;
    }

    @Override
    public HDDDTO toDTO(HDD entity){
        return new HDDDTO(
                entity.getId(),
                entity.getName(),
                entity.getPrice(),
                entity.getStockQuantity(),
                entity.getVolume()
        );
    }

}
