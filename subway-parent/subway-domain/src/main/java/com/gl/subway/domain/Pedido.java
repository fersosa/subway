package com.gl.subway.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

import com.gl.subway.dto.PedidoNuevo;

public class Pedido implements Serializable {

	private static final long serialVersionUID = -3484571533209062034L;

	@Id
	private String id;

	private Date fechaHora;

	private String sucursal;

	private Map<String, Integer> productoCantidad;

	private String email;

	private List<String> promociones = new ArrayList<>();

	public Pedido() {
		super();
	}

	public Pedido(PedidoNuevo pedidoNuevo) {
		this.setProductoCantidad(pedidoNuevo.getProductoCantidad());
		this.email = pedidoNuevo.getEmail();
		this.fechaHora = new Date();
	}

	public Date getFechaHora() {
		return new Date(fechaHora.getTime());
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = new Date(fechaHora.getTime());
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
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

	public List<String> getPromociones() {
		return new ArrayList<String>(promociones);
	}

	public void setPromociones(List<String> promocion) {
		this.promociones = new ArrayList<String>(promocion);
	}

	public void addPromocion(String codigo) {
		promociones.add(codigo);
	}

	public Map<String, Integer> getProductoCantidad() {
		return productoCantidad;
	}

	public void setProductoCantidad(Map<String, Integer> productoCantidad) {
		this.productoCantidad = productoCantidad;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fechaHora=" + fechaHora + ", sucursal=" + sucursal + ", productoCantidad="
				+ getProductoCantidad() + ", email=" + email + ", promociones=" + promociones + "]";
	}
}
