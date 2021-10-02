package ru.nsu.testtask.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.testtask.data.dto.HDDDTO;
import ru.nsu.testtask.data.entity.HDD;

@RequiredArgsConstructor
@Component
public class HDDMapper implements Mapper<HDD, HDDDTO>{

    @Override
    public HDD toEntity(HDDDTO dto) {
        return null;
    }

    @Override
    public HDDDTO toDTO(HDD entity) {
        return null;
    }
}
