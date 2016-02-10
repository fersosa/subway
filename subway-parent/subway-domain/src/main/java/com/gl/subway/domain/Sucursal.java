package com.gl.subway.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Min(value = 0)
	private int altura;

	@OneToMany(mappedBy = "sucursal", fetch = FetchType.LAZY)
	private List<Promocion> promociones;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Ciudad ciudad;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public List<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promocion> promociones) {
		this.promociones = promociones;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
}
