package com.gl.subway.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.gl.subway.domain.Cliente;
import com.gl.subway.repository.ClienteRepository;

@Repository
public class JpaClienteRepository implements ClienteRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveUpdate(Cliente cliente) {
		em.merge(cliente);
	}

}
