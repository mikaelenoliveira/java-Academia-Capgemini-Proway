package com.ApiRest.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entidades.Contato;
import com.ApiRest.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	ContatoRepository repo;
	
	public Contato salvar(Contato contato) {
		return repo.save(contato);
	}
	
	public List<Contato> consultarContatos() {
		List<Contato> contatos = repo.findAll();
		return contatos;
	}
	
	public Contato consultarContatoPorId(Long idcontato) {
		java.util.Optional<Contato> opcontato = repo.findById(idcontato);
		Contato ct = opcontato.orElseThrow(() -> new EntityNotFoundException("Contato não encontrado"));
		return ct;
	}
	
	public void excluirContato(Long idcontato) {
		Contato ct = consultarContatoPorId(idcontato);
		repo.delete(ct);
	}
	
	public Contato alterarContato(Long idcontato, Contato contato) {
		Contato contatoSalvo = consultarContatoPorId(idcontato);
		contatoSalvo.setNome(contato.getNome());
		contatoSalvo.setEmail(contato.getEmail());
		contatoSalvo.setFone(contato.getFone());
		return repo.save(contatoSalvo);
	}
	
}
