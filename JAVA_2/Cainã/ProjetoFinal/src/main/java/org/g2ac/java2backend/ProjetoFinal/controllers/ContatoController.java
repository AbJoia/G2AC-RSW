package org.g2ac.java2backend.ProjetoFinal.controllers;

import java.util.List;

import org.g2ac.java2backend.ProjetoFinal.entities.Contato;
import org.g2ac.java2backend.ProjetoFinal.services.ContatoService;
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
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;

	@GetMapping
	public List<Contato> getContatos() {
		return contatoService.getContatos();
	}

	@GetMapping("/{id}")
	public Contato getContato(@PathVariable Integer id) {
		return contatoService.getContato(id);
	}

	@PostMapping
	public void insertContato(@RequestBody Contato contato) {
		contatoService.insertContato(contato);
	}
	
	@PutMapping("/{id}")
	public Contato updateContato(@PathVariable Integer id, @RequestBody Contato newContato) {
		return contatoService.updateContato(id, newContato);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContato(@PathVariable Integer id) {
		contatoService.deleteContato(id);
	}
}
