package com.gl.subway.repository;

import java.util.List;

import com.gl.subway.domain.Cliente;

public interface ClienteRepository {

	void saveUpdate(Cliente cliente);

	List<Cliente> list();

}
