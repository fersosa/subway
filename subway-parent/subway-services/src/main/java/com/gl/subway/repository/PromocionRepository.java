package com.gl.subway.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.subway.domain.Producto;
import com.gl.subway.domain.Promocion;
import com.gl.subway.domain.Sucursal;

public interface PromocionRepository extends CrudRepository<Promocion, Long> {

	Promocion findByProductoAndSucursal(Producto producto, Sucursal sucursal);
}
