package ru.nsu.testtask.data.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.testtask.data.enums.ProductType;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@DiscriminatorColumn
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long serialNumber;

    @Column(nullable = false)
    private String producer;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer stockQuantity;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private ProductType productType;

    public Product() {}
}
