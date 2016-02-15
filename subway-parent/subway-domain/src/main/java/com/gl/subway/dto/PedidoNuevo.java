package com.gl.subway.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PedidoNuevo implements Serializable {

	private static final long serialVersionUID = -5083136465645217672L;

	private Map<String, Integer> productoCantidad;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<String, Integer> getProductoCantidad() {
		return new HashMap<String, Integer>(productoCantidad);
	}

	public void setProductoCantidad(Map<String, Integer> productoCantidad) {
		this.productoCantidad = new HashMap<String, Integer>(productoCantidad);
	}
}
