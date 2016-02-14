package com.gl.subway.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "nombre") })
public class Ciudad extends AbstractIdentificable {

	private static final long serialVersionUID = -8603676653763489862L;

	@NotEmpty
	private String nombre;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Provincia provincia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", provincia=" + provincia + "]";
	}

}
