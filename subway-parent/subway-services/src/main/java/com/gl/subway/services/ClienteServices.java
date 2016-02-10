package com.gl.subway.services;

import java.util.List;

import com.gl.subway.domain.Cliente;

public interface ClienteServices {

	void saveCliente(Cliente cliente);
	
	List<Cliente> list();
}
