package com.gl.subway.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.subway.domain.Cliente;
import com.gl.subway.repository.ClienteRepository;
import com.gl.subway.services.ClienteServices;

@Service
@Transactional
public class ClienteServicesImpl implements ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
