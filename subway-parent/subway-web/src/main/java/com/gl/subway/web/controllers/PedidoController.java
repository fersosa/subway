package com.gl.subway.web.controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gl.subway.domain.Pedido;

@Controller
@RequestMapping("/pedidos")
public class PedidoController extends BaseController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public List<Pedido> list() {
		Pedido pedido = new Pedido();
		pedido.setEmail("cliente@gmail.com");
		pedido.setFechaHora(new Date());
		pedido.setProducto("p_1");
		pedido.setSucursal("s_1");
		return Arrays.asList(pedido);
	}
}
