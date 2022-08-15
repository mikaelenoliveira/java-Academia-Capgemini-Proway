package com.ApiRest.controllers;

import java.util.List;
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
import com.ApiRest.services.ContatoService;

@RestController
@RequestMapping
public class ContatoController {
		
	@Autowired
	ContatoService service;
	
	@GetMapping("/")
	public String xpto() {
		return "Pagina de index";		
	}
	
	@GetMapping("/contatos")
	public ResponseEntity<List<Contato>> getContatos() {
		List<Contato> contatos = service.consultarContatos();
		return ResponseEntity.status(HttpStatus.OK).body(contatos);		
	}
	
	@GetMapping("/contatos/{idcontato}")
	public ResponseEntity<Contato> getContatoById(@PathVariable("idcontato") Long idcontato) {
		return ResponseEntity.ok(service.consultarContatoPorId(idcontato));
	}
	
	@PostMapping("/contatos")
	public ResponseEntity<Contato> saveContato(@RequestBody Contato contato) {
		Contato ct = service.salvar(contato);
		return ResponseEntity.status(HttpStatus.CREATED).body(ct);
	}
	
	
	@DeleteMapping("/contatos/{idcontato}")
	public ResponseEntity<Void> deleteContato(@PathVariable("idcontato") Long idcontato) {
		service.excluirContato(idcontato);
		return ResponseEntity.noContent().build();
	
	}
	
	@PutMapping("/contatos/{idcontato}")
	public ResponseEntity<Contato> alteraContato(@PathVariable("idcontato") Long idcontato, 
			@RequestBody Contato contato) {
			return ResponseEntity.ok(service.alterarContato(idcontato, contato));
	}
}