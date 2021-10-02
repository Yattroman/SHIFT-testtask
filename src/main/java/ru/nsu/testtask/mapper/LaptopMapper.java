package ru.nsu.testtask.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.testtask.data.dto.LaptopDTO;
import ru.nsu.testtask.data.entity.Laptop;

@RequiredArgsConstructor
@Component
public class LaptopMapper implements Mapper<Laptop, LaptopDTO>{

    @Override
    public Laptop toEntity(LaptopDTO dto) {
        return null;
    }

    @Override
    public LaptopDTO toDTO(Laptop entity) {
        return null;
    }
}
