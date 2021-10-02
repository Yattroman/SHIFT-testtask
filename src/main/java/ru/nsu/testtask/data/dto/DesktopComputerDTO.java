package ru.nsu.testtask.data.dto;

import ru.nsu.testtask.data.enums.DesktopComputerFormFactor;

import javax.validation.constraints.NotEmpty;

public class DesktopComputerDTO extends ProductDTO {

    @NotEmpty
    private DesktopComputerFormFactor type;

}
