package ru.nsu.testtask.data.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ProductDTO implements DTO{

    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private Double price;

    @NotEmpty
    private Integer stockQuantity;

    public ProductDTO() {}

}
