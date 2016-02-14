package com.gl.subway.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.subway.domain.Sucursal;

public interface SucursalRespository extends CrudRepository<Sucursal, Long> {

	Sucursal findByCodigo(String codigo);
}
