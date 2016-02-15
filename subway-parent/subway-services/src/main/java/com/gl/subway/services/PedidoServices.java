package com.gl.subway.services;

import java.util.List;

import com.gl.subway.domain.Pedido;
import com.gl.subway.dto.PedidoNuevo;

public interface PedidoServices {

	/**
	 * Lista todos los pedidos registrados.
	 * 
	 * @return list de pedidos registrados
	 */
	List<Pedido> listar();

	/**
	 * Registra un pedido nuevo.
	 * 
	 * @param pedido
	 *            pedido nuevo
	 * @return pedido registrado
	 */
	Pedido registrar(PedidoNuevo pedido);

}
