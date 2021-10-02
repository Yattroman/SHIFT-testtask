package ru.nsu.testtask.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.testtask.data.dto.MonitorDTO;
import ru.nsu.testtask.data.entity.Monitor;

@RequiredArgsConstructor
@Component
public class MonitorMapper implements Mapper<Monitor, MonitorDTO>{

    @Override
    public Monitor toEntity(MonitorDTO dto) {
        return null;
    }

    @Override
    public MonitorDTO toDTO(Monitor entity) {
        return null;
    }
}
