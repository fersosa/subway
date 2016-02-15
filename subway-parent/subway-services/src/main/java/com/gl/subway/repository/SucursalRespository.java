package com.gl.subway.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.subway.domain.Sucursal;

public interface SucursalRespository extends CrudRepository<Sucursal, Long> {

	Long countByCodigo(String codigo);

	Sucursal findByCodigo(String codigo);
}
