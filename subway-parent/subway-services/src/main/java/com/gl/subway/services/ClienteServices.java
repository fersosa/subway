package com.gl.subway.services;

import com.gl.subway.domain.Cliente;

public interface ClienteServices {

	Cliente saveCliente(Cliente cliente);

	Cliente asignarSucursal(Cliente cliente, String codigoSucursal);
}
