package com.gl.subway.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

import com.gl.subway.domain.base.AbstractIdentificable;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "codigo") })
public class Promocion extends AbstractIdentificable {

	private static final long serialVersionUID = 7967702495872784550L;

	@Min(value = 0)
	@Max(value = 100)
	private int descuento; // 0-100%

	@Min(value = 0)
	private int cantidadMin;

	@Min(value = 0)
	private int cantidadMax;

	@NotEmpty
	private String codigo;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Promocion [descuento=" + descuento + ", cantidadMin=" + cantidadMin + ", cantidadMax=" + cantidadMax
				+ ", codigo=" + codigo + ", producto=" + producto + ", sucursal=" + sucursal + "]";
	}
}
