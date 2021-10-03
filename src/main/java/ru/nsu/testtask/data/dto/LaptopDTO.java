package ru.nsu.testtask.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.testtask.data.enums.ProductType;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class LaptopDTO extends ProductDTO{

    @NotEmpty
    private Double diagonal;

    public LaptopDTO(Integer id, @NotEmpty String name, @NotEmpty Double price, @NotEmpty Integer stockQuantity, @NotEmpty ProductType type, @NotEmpty Double diagonal) {
        super(id, name, price, stockQuantity, type);
        this.diagonal = diagonal;
    }
}
