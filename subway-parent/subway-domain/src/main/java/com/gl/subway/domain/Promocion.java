package com.gl.subway.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
public class Promocion extends AbstractIdentificable {

	private static final long serialVersionUID = 7967702495872784550L;

	@Min(value = 0)
	@Max(value = 100)
	private int descuento; // 0-100%

	@Min(value = 0)
	private int cantidadMin;

	@Min(value = 0)
	private int cantidadMax;

	@NotNull
	private Date desde;

	@NotNull
	private Date hasta;

	@ManyToOne(fetch = FetchType.EAGER)
	private Producto producto;

	@ManyToOne(fetch = FetchType.EAGER)
	private Sucursal sucursal;

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getCantidadMin() {
		return cantidadMin;
	}

	public void setCantidadMin(int cantidadMin) {
		this.cantidadMin = cantidadMin;
	}

	public int getCantidadMax() {
		return cantidadMax;
	}

	public void setCantidadMax(int cantidadMax) {
		this.cantidadMax = cantidadMax;
	}

	public Date getDesde() {
		return desde;
	}

	public void setDesde(Date desde) {
		this.desde = desde;
	}

	public Date getHasta() {
		return hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}
