package com.gl.subway.services;

import com.gl.subway.domain.Cliente;

public interface ClienteServices {

	/**
	 * Guarda los datos para un cliente.
	 * 
	 * @param cliente
	 *            a guardar
	 * @return cliente guardado
	 */
	Cliente saveCliente(Cliente cliente);

	/**
	 * Asigna/Modifica la sucursal asignada a un cliente, siempre y cuando el
	 * codigoSucursal sea valido.
	 * 
	 * @param cliente
	 *            a modificar
	 * @param codigoSucursal
	 *            a asignar
	 * @return cliente modificado
	 */
	Cliente asignarSucursal(Cliente cliente, String codigoSucursal);
}
