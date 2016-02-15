package com.gl.subway.dto;

import java.io.Serializable;

public class PedidoNuevo implements Serializable {

	private static final long serialVersionUID = -4164725949430771885L;

	private String producto;
	private String email;
	private int cantidad;

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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "PedidoNuevo [producto=" + producto + ", email=" + email + ", cantidad=" + cantidad + "]";
	}
}
