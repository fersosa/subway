package com.gl.subway.web.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gl.subway.domain.Pedido;
import com.gl.subway.dto.PedidoNuevo;
import com.gl.subway.services.PedidoServices;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController {

	@Autowired
	private PedidoServices pedidoServices;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Pedido> listar() {
		return pedidoServices.listar();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public Pedido registrar(@RequestBody PedidoNuevo pedido) {
		return pedidoServices.registrar(pedido);
	}
}
