package com.DogApiRest.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DogApiRest.Entidades.Dog;
import com.DogApiRest.Repository.DogRepository;

@Service
public class DogService {
	
	@Autowired
	DogRepository repo;
	
	public Dog salvar(Dog dog) {
		return repo.save(dog);
	}
	
	public List<Dog> consultarDogs() {
		List<Dog> dogs = repo.findAll();
		return dogs;
	}
	
	public Dog consultarDogPorId(Long iddog) {
		java.util.Optional<Dog> opdog = repo.findById(iddog);
		Dog ct = opdog.orElseThrow(() -> new EntityNotFoundException("Doguinho não encontrado"));
		return ct;
	}
	
	public void excluirDog(Long iddog) {
		Dog ct = consultarDogPorId(iddog);
		repo.delete(ct);
	}
	
	public Dog alterarDog(Long iddog, Dog dog) {
		Dog dogSalvo = consultarDogPorId(iddog);
		dogSalvo.setNome(dog.getNome());
		dogSalvo.setRaca(dog.getRaca());
		dogSalvo.setIdade(dog.getIdade());
		return repo.save(dogSalvo);
	}

}
