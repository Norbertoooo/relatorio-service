package com.vitu.repository;

import com.vitu.domain.Venda;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface VendaRepository extends CrudRepository<Venda, String> {
}
