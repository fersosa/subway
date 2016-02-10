package com.gl.subway.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
public class Producto extends AbstractIdentificable {

	private static final long serialVersionUID = -2657669844752568335L;

	@NotEmpty
	private String codigo;
	@NotEmpty
	private String nombre;

	@NotNull
	@Min(value = 0)
	private BigDecimal precio;
	@Transient
	private List<Promocion> promociones;
}
