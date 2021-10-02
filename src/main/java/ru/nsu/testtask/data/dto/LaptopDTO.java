package ru.nsu.testtask.data.dto;

import javax.validation.constraints.NotEmpty;

public class LaptopDTO extends ProductDTO{

    @NotEmpty
    private double diagonal;

}
