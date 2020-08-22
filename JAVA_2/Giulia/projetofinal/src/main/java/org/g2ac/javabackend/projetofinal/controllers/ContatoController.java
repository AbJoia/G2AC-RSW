package org.g2ac.javabackend.projetofinal.controllers;

import java.util.List;

import org.g2ac.javabackend.projetofinal.entities.Contato;
import org.g2ac.javabackend.projetofinal.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoService coService;
	
	@GetMapping
	public List<Contato> home(){
		return coService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Contato especificoID(@PathVariable Integer id) {
		return coService.buscarPorID(id);
	}
	
	@PostMapping
	public Contato add(@RequestBody Contato corpo) {
		return coService.adicionar(corpo);
	}
	
	@PutMapping("/{id}")
	public Contato update(@PathVariable Integer id, @RequestBody Contato novo) {
		return coService.atualizar(id, novo);
	}
	
	public void delete(@PathVariable Integer id) {
		coService.deletar(id);
	}
}
