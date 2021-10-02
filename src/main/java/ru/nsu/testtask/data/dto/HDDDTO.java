package ru.nsu.testtask.data.dto;

import javax.validation.constraints.NotEmpty;

public class HDDDTO extends ProductDTO{

    @NotEmpty
    private int volume;

}
