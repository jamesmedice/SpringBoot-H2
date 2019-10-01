package com.medici.app.spring.sevice.mapper;

import java.util.List;

/**
 * 
 * @author a73s
 *
 * @param <D>
 * @param <E>
 */


public interface EntityMapper<D, E> {

	E toEntity(D dto);

	D toDto(E entity);

	List<E> toEntity(List<D> dtoList);

	List<D> toDto(List<E> entityList);
}
