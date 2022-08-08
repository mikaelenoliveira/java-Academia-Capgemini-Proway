package com.dog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dog.entidades.Dog;
import com.dog.repository.IDogRepository;



@Controller
@RequestMapping("/")
public class DogController {
	@Autowired	
	private IDogRepository repo;
	
	
	@GetMapping
	public String indexDog() {
		return "indexDog";
	}
	
	@GetMapping("/cadastroDog")
	public String formCadastroDog() {
		return "cadastroDog";
	}
	
	@PostMapping("/cadastroDog")
	public String salvar(Dog dog) {
		repo.save(dog);
		return "redirect:/consultaDog";
	}
	
	@GetMapping("/consultaDog")
	public String formConsulta(Model model) {
		Iterable<Dog> dogs = repo.findAll();
		model.addAttribute("dogs", dogs);
		return "consultaDog";
	}
	
	@GetMapping("/consultaDog/{iddog}")
	public String formEditar(@PathVariable("iddog") int id, Model model) {
		Dog dog =  repo.findById(id).get();
		model.addAttribute("dog", dog);	
		return "edicaoDog";
	}
	
	@GetMapping("/delete/{iddog}")
	public String delete(@PathVariable("iddog") int id) {
		repo.deleteById(id);
		return "redirect:/consultaDog";
	}
}
