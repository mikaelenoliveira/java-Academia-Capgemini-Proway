package com.DogApiRest.Controllers;

import java.util.List;

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
import com.DogApiRest.service.DogService;

@RestController
@RequestMapping
public class DogController {

	@Autowired
	DogService service;

	@GetMapping("/")
	public String xpto() {
		return "Pagina de index";
	}

	@GetMapping("/dogs")
	public ResponseEntity<List<Dog>> getDogs() {
		List<Dog> dogs = service.consultarDogs();
		return ResponseEntity.status(HttpStatus.OK).body(dogs);
	}

	@GetMapping("/dogs/{iddog}")
	public ResponseEntity<Dog> getDogById(@PathVariable("iddog") Long iddog) {
		return ResponseEntity.ok(service.consultarDogPorId(iddog));

	}

	@PostMapping("/dogs")
	public ResponseEntity<Dog> saveDog(@RequestBody Dog dog) {
		Dog dg = service.salvar(dog);
		return ResponseEntity.status(HttpStatus.CREATED).body(dg);
	}

	@DeleteMapping("/dogs/{iddog}")
	public ResponseEntity<Void> deleteDog(@PathVariable("iddog") Long iddog) {
		service.excluirDog(iddog);
		return ResponseEntity.noContent().build();

	}

	@PutMapping("/dogs/{iddog}")
	public ResponseEntity<Dog> alteraDog(@PathVariable("iddog") Long iddog, @RequestBody Dog dog){
		return ResponseEntity.ok(service.alterarDog(iddog, dog));
	}

}
