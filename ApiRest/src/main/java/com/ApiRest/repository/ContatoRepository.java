package com.ApiRest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ApiRest.entidades.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long>{

}
