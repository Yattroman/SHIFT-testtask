package ru.nsu.testtask.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.testtask.data.dto.DesktopComputerDTO;
import ru.nsu.testtask.data.entity.DesktopComputer;

@RequiredArgsConstructor
@Component
public class DesktopComputerMapper implements Mapper<DesktopComputer, DesktopComputerDTO> {

    @Override
    public DesktopComputer toEntity(DesktopComputerDTO dto) {
        return null;
    }

    @Override
    public DesktopComputerDTO toDTO(DesktopComputer entity) {
        return null;
    }

}
