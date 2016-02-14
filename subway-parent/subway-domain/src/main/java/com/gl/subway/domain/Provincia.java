package com.gl.subway.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "nombre") })
public class Provincia extends AbstractIdentificable {

	private static final long serialVersionUID = 518610257661670930L;

	@NotEmpty
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
