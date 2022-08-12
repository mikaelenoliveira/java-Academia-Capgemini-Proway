package com.DogApiRest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DogApiRest.Entidades.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long>{

}
