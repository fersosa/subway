package com.gl.subway.services.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.subway.domain.Cliente;
import com.gl.subway.domain.Sucursal;
import com.gl.subway.repository.ClienteRepository;
import com.gl.subway.repository.SucursalRespository;
import com.gl.subway.services.ClienteServices;

@Service
@Transactional
public class ClienteServicesImpl implements ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private SucursalRespository sucursalRepository;

	@Override
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente asignarSucursal(Cliente cliente, String codigoSucursal) {
		Sucursal sucursal = sucursalRepository.findByCodigo(codigoSucursal);
		if (sucursal == null) {
			throw new EntityNotFoundException("Sucursal desconocida");
		}
		cliente.setSucursalCercana(sucursal);
		return cliente;
	}

}
