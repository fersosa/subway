package com.gl.subway.services.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.subway.domain.Cliente;
import com.gl.subway.domain.Pedido;
import com.gl.subway.domain.Promocion;
import com.gl.subway.dto.PedidoNuevo;
import com.gl.subway.repository.ClienteRepository;
import com.gl.subway.repository.PedidoRepository;
import com.gl.subway.repository.ProductoRepository;
import com.gl.subway.repository.PromocionRepository;
import com.gl.subway.services.PedidoServices;

@Service
@Transactional
public class PedidoServicesImpl implements PedidoServices {

	@Autowired
	private PedidoRepository pedidosRepository;

	@Autowired
	private ProductoRepository productoRespository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private PromocionRepository promocionRepository;

	@Override
	public List<Pedido> listar() {
		return pedidosRepository.findAll();
	}

	@Override
	public Pedido registrar(PedidoNuevo pedidoNuevo) {

		if (MapUtils.isEmpty(pedidoNuevo.getProductoCantidad())) {
			throw new IllegalArgumentException("Pedido sin productos");
		}

		for (String producto : pedidoNuevo.getProductoCantidad().keySet()) {
			if (productoRespository.countByCodigo(producto) == 0) {
				throw new EntityNotFoundException("Codigo Producto desconocido: " + producto);
			}
		}

		Cliente cliente = clienteRepository.findByEmail(pedidoNuevo.getEmail());
		if (cliente == null) {
			throw new EntityNotFoundException("Email Cliente desconocido");
		}

		Pedido pedido = new Pedido(pedidoNuevo);

		for (String producto : pedidoNuevo.getProductoCantidad().keySet()) {
			Promocion promocion = promocionRepository.findByProductoAndSucursal(
					productoRespository.findByCodigo(producto), cliente.getSucursalCercana());
			if (promocion != null) {
				pedido.addPromocion(promocion.getCodigo());
			}
		}

		pedido.setSucursal(cliente.getSucursalCercana().getCodigo());

		return pedidosRepository.save(pedido);
	}
}
