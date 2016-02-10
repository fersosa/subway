package com.gl.subway.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
public class Promocion extends AbstractIdentificable {

	private static final long serialVersionUID = 7967702495872784550L;

	@Min(value = 0)
	@Max(value = 100)
	private int descuento; // 0-100%

	@Min(value = 0)
	private int cantidadMin;

	@Min(value = 0)
	private int cantidadMax;

	@NotNull
	private Date desde;

	@NotNull
	private Date hasta;
	@Transient
	private Producto producto;
	@Transient
	private Sucursal sucursal;
}
