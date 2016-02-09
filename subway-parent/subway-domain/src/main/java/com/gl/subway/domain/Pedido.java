package com.gl.subway.domain;

import java.util.Date;

import com.gl.subway.domain.base.AbstractIdentificable;

public class Pedido extends AbstractIdentificable {

	private static final long serialVersionUID = -5220170627078630334L;

	private Date fechaHora;

	private String sucursal;
	
	private String producto;
	
	private String email;

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
