package com.gl.subway.web.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.gl.subway.domain.Cliente;
import com.gl.subway.services.ClienteServices;
import com.gl.subway.web.soap.RegistrarClienteRequest;
import com.gl.subway.web.soap.RegistrarClienteResponse;

@Endpoint
public class ClienteEndpoint {

	private static final String NAMESPACE_URI = "http://gl.com/subway/web/soap";

	@Autowired
	private ClienteServices clienteServices;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "registrarClienteRequest")
	@ResponsePayload
	public RegistrarClienteResponse registrarCliente(@RequestPayload RegistrarClienteRequest request) {
		Cliente cliente = new Cliente();
		cliente.setApellido(request.getApellido());
		cliente.setEmail(request.getEmail());
		cliente.setNombre(request.getNombre());
		// cliente.setSucursalCercana();
		return buildResponse(clienteServices.saveCliente(cliente));
	}

	private RegistrarClienteResponse buildResponse(Cliente cliente) {
		com.gl.subway.web.soap.Cliente responseCliente = new com.gl.subway.web.soap.Cliente();
		responseCliente.setId(cliente.getId());
		responseCliente.setApellido(cliente.getApellido());
		responseCliente.setNombre(cliente.getNombre());
		responseCliente.setEmail(cliente.getEmail());
		RegistrarClienteResponse response = new RegistrarClienteResponse();
		response.setCliente(responseCliente);
		return response;
	}

}
