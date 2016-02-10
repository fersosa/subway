package com.gl.subway.domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
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
