package com.gl.todolist.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.subway.domain.Cliente;
import com.gl.todolist.repository.ClienteRepository;
import com.gl.todolist.services.ClienteServices;

@Service
@Transactional
public class ClienteServicesImpl implements ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void saveCliente(Cliente cliente) {
		clienteRepository.saveUpdate(cliente);
	}

}
