package com.dog.repository;

import org.springframework.data.repository.CrudRepository;

import com.dog.entidades.Dog;

public interface IDogRepository extends CrudRepository<Dog, Integer>{

	
}
