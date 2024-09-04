package com.example.demo.web.mapper;

public interface Mappeble<E, D> {

    E toEntity(D dto);
    D toDto(E entity);
}
