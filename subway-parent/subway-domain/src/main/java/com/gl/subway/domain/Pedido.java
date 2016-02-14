package com.gl.subway.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Pedido implements Serializable {

	private static final long serialVersionUID = -5220170627078630334L;

	@Id
	private String id;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fechaHora=" + fechaHora + ", sucursal=" + sucursal + ", producto=" + producto
				+ ", email=" + email + "]";
	}

}
