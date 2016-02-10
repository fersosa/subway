package com.gl.subway.domain;

import javax.persistence.Entity;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
public class Ciudad extends AbstractIdentificable {

	private static final long serialVersionUID = -8603676653763489862L;

	@NotEmpty
	private String nombre;
	@Transient
	private Provincia provincia;
}
