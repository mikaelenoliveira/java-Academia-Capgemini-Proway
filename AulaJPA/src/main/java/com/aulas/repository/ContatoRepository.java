package com.aulas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aulas.entidades.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Integer>{

}
