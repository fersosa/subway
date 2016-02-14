package com.gl.subway.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.subway.domain.Pedido;
import com.gl.subway.repository.PedidoRepository;
import com.gl.subway.services.PedidoServices;

@Service
@Transactional
public class PedidoServicesImpl implements PedidoServices {

	private PedidoRepository pedidosRepository;

	@Override
	public List<Pedido> list() {
		return pedidosRepository.findAll();
	}

}
