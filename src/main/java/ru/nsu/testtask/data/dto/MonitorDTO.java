package ru.nsu.testtask.data.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MonitorDTO extends ProductDTO {

    @NotEmpty
    private Double diagonal;

    public MonitorDTO(Integer id, @NotEmpty String name, @NotEmpty Double price, @NotEmpty Integer stockQuantity, @NotEmpty Double diagonal) {
        super(id, name, price, stockQuantity);
        this.diagonal = diagonal;
    }
}
