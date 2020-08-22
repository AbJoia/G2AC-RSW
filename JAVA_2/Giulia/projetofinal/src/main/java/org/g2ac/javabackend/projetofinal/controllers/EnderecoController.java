package org.g2ac.javabackend.projetofinal.controllers;

import java.util.List;

import org.g2ac.javabackend.projetofinal.entities.Endereco;
import org.g2ac.javabackend.projetofinal.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService eService; 
	
	@GetMapping
	public List<Endereco> home(){ 
		return eService.buscaTodos();
	}
	
	@GetMapping("/{id}")
	public Endereco especificoID(@PathVariable Integer id) {
		return eService.buscaPorID(id);
	}
	
	@PostMapping
	public Endereco add(@RequestBody Endereco corpo) {
		return eService.adicionar(corpo);
	}
	
	@PutMapping("/{id}")
	public Endereco update(@PathVariable Integer id, @RequestBody Endereco novo) {
		return eService.atualizar(id, novo);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		eService.deletar(id);
	}
}
