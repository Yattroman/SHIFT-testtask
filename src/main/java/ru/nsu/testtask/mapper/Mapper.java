package ru.nsu.testtask.mapper;

import ru.nsu.testtask.data.dto.DTO;
import ru.nsu.testtask.data.entity.ENTITY;

public interface Mapper<E extends ENTITY, D extends DTO>{
    E toEntity(D dto);
    D toDTO(E entity);
}
