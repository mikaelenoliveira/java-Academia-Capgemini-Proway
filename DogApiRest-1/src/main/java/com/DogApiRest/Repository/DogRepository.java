package com.DogApiRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DogApiRest.Entidades.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long>{

}
