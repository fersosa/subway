package com.gl.subway.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "email") })
public class Cliente extends AbstractIdentificable {

	private static final long serialVersionUID = -5383303505059989259L;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apellido;

	@NotEmpty
	@Email
	private String email;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Sucursal sucursalCercana;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Sucursal getSucursalCercana() {
		return sucursalCercana;
	}

	public void setSucursalCercana(Sucursal sucursalCercana) {
		this.sucursalCercana = sucursalCercana;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", sucursalCercana="
				+ sucursalCercana + "]";
	}

}
