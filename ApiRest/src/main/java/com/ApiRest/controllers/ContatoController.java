package com.ApiRest.controllers;

import java.util.Optional;

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

import com.ApiRest.entidades.Contato;
import com.ApiRest.repository.ContatoRepository;

@RestController
@RequestMapping
public class ContatoController {
	
	@Autowired
	ContatoRepository repo;
	
	@GetMapping("/")
	public String xpto() {
		return "Pagina de index";		
	}
	
	@GetMapping("/contatos")
	public ResponseEntity<Iterable<Contato>> getContatos() {
		Iterable<Contato> contatos = repo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(contatos);		
	}
	
	@GetMapping("/contatos/{idcontato}")
	public ResponseEntity<Contato> getContatoById(@PathVariable("idcontato") Long idcontato) {
		//return ResponseEntity.status(HttpStatus.OK).body(repo.findById(idcontato).get());	
		Optional<Contato> contato = repo.findById(idcontato);
		return contato.isPresent() ? ResponseEntity.ok(contato.get()) : ResponseEntity.notFound().build();
	}
	
	@PostMapping("/contatos")
	public ResponseEntity<Contato> saveContato(@RequestBody Contato contato) {
		Contato ct = repo.save(contato);
		return ResponseEntity.status(HttpStatus.CREATED).body(ct);
	}
	
	
	@DeleteMapping("/contatos/{idcontato}")
	public ResponseEntity<Void> deleteContato(@PathVariable("idcontato") Long idcontato) {
		repo.deleteById(idcontato);
		return ResponseEntity.noContent().build();
	
	}
	
	@PutMapping("/contatos/{idcontato}")
	public ResponseEntity<Contato> alteraContato(@PathVariable("idcontato") Long idcontato, 
			@RequestBody Contato contato) {
		contato.setId(idcontato);
		Contato response = repo.save(contato);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
