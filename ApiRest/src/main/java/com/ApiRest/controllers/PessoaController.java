package com.ApiRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiRest.entidades.Pessoa;
import com.ApiRest.services.PessoaService;

@RequestMapping("/")
@RestController
public class PessoaController {
	
	@Autowired
	PessoaService service;
	
	@GetMapping("/pessoa/{idpessoa}")
	public ResponseEntity<Pessoa> consultar(@PathVariable("idpessoa") long idpessoa){
		return ResponseEntity.status(HttpStatus.OK).body(service.consultar(idpessoa));
	}
	
	@PostMapping("/pessoa")
	public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(pessoa));
	}
	

}
