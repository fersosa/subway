package com.gl.subway.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.subway.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	Cliente findByEmail(String email);
}
