package com.gl.subway.domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
public class Cliente extends AbstractIdentificable {

	private static final long serialVersionUID = -5383303505059989259L;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apellido;
	
	@NotEmpty
	@Email
	private String email;
	
	
	private Sucursal sucursalCercana;
}
