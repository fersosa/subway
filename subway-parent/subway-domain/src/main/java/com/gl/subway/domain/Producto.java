package com.gl.subway.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "codigo") })
public class Producto extends AbstractIdentificable {

	private static final long serialVersionUID = -2657669844752568335L;

	@NotEmpty
	private String codigo;
	@NotEmpty
	private String nombre;

	@NotNull
	@Min(value = 0)
	private BigDecimal precio;

	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	private List<Promocion> promociones;
}
