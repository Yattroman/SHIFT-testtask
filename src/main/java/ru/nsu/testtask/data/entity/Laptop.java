package ru.nsu.testtask.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "Laptop")
@AllArgsConstructor
@DiscriminatorValue("L")
public class Laptop extends Product{

    @Column
    private Double diagonal;

    public Laptop() {}
}
