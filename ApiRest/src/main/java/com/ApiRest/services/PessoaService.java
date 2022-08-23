package com.ApiRest.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entidades.Pessoa;
import com.ApiRest.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repo;
	
	public Pessoa consultar(Long idpessoa) {
		Optional<Pessoa> obj = repo.findById(idpessoa);
		return obj.orElseThrow(() -> new EntityNotFoundException("Pessoa não encontrada"));
	}
	
	public Pessoa salvar(Pessoa pessoa) {
		return repo.save(pessoa);
	}

}
