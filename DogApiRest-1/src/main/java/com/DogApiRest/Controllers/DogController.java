package com.DogApiRest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DogApiRest.Entidades.Dog;
import com.DogApiRest.Repository.DogRepository;

@RestController
@RequestMapping
public class DogController {

	@Autowired
	DogRepository repo;

	@GetMapping("/")
	public String xpto() {
		return "Pagina de index";
	}

	@GetMapping("/dogs")
	public ResponseEntity<Iterable<Dog>> getDogs() {
		Iterable<Dog> dogs = repo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(dogs);
	}

	@GetMapping("/dogs/{iddog}")
	public ResponseEntity<Dog> getDogById(@PathVariable("iddog") Long iddog) {
		java.util.Optional<Dog> dog = repo.findById(iddog);
		return dog.isPresent() ? ResponseEntity.ok(dog.get()) : ResponseEntity.notFound().build();

	}

	@PostMapping("/dogs")
	public ResponseEntity<Dog> saveDog(@RequestBody Dog dog) {
		Dog dg = repo.save(dog);
		return ResponseEntity.status(HttpStatus.CREATED).body(dg);
	}

	@DeleteMapping("/dogs/{iddog}")
	public ResponseEntity<Void> deleteDog(@PathVariable("iddog") Long iddog) {
		repo.deleteById(iddog);
		return ResponseEntity.noContent().build();

	}

	@PutMapping("/dogs/{iddog}")
	public ResponseEntity<Dog> alteraDog(@PathVariable("iddog") Long iddog, @RequestBody Dog dog) {
		java.util.Optional<Dog> dogs = repo.findById(iddog);
		if (!dogs.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		dog.setId(iddog);
		repo.save(dog);
		return ResponseEntity.ok(dog);
	}

}
