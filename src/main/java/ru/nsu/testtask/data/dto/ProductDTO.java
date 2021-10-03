package ru.nsu.testtask.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO implements DTO{

    private Integer id;

    @NotEmpty
    private String name;

    @NotEmpty
    private Double price;

    @NotEmpty
    private Integer stockQuantity;

    public ProductDTO() {}

}
