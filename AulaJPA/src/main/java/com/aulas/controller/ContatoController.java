package com.aulas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.entidades.Contato;
import com.aulas.repository.ContatoRepository;

@Controller
@RequestMapping("/")
public class ContatoController {

	
	@Autowired	
	private ContatoRepository repo;
	
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("/cadastro")
	public String formCadastro() {
		return "cadastro";
	}
	
	@PostMapping("/cadastro")
	public String salvar(Contato contato) {
		//contato.setId(contatos.size()+1);
		//contatos.add(contato);
		repo.save(contato);
		return "redirect:/consulta";
	}
	
	@GetMapping("/consulta")
	public String formConsulta(Model model) {
		Iterable<Contato> contatos = repo.findAll();
		model.addAttribute("contatos", contatos);
		return "consulta";
	}
	
	@GetMapping("/consulta/{idcontato}")
	public String formEditar(@PathVariable("idcontato") int id, Model model) {
		Contato contato =  repo.findById(id).get();
		model.addAttribute("contato", contato);	
		return "edicao";
	}
	
	@GetMapping("/delete/{idcontato}")
	public String delete(@PathVariable("idcontato") int id) {
		repo.deleteById(id);
		return "redirect:/consulta";
	}

}
