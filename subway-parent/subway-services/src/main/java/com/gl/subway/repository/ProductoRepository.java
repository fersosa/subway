package com.gl.subway.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.subway.domain.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

	Long countByCodigo(String codigo);

	Producto findByCodigo(String codigo);
}
