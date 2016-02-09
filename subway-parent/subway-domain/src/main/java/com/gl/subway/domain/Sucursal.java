package com.gl.subway.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
public class Sucursal extends AbstractIdentificable {

	private static final long serialVersionUID = -5056544434409243469L;
	
	@NotEmpty
	private String codigo;
	@NotEmpty
	private String calle;
	@Min(value=0)
	private int altura;
	
	private List<Promocion> promociones;
	
	private Ciudad ciudad;
}
