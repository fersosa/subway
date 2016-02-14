package com.gl.subway.web.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gl.subway.domain.Pedido;
import com.gl.subway.services.PedidoServices;

@Controller
@RequestMapping("/pedidos")
public class PedidoController extends BaseController {

	@Autowired
	private PedidoServices pedidoServices;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public List<Pedido> list() {
		return pedidoServices.list();
	}
}
