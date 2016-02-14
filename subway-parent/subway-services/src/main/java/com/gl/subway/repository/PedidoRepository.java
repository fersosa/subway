package com.gl.subway.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gl.subway.domain.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido, String> {

}
