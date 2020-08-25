package org.g2ac.backend.ProjetoFinal.controller;

import java.util.List;

import javax.validation.Valid;

import org.g2ac.backend.ProjetoFinal.entity.Contato;
import org.g2ac.backend.ProjetoFinal.service.ContatoService;
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

	@PostMapping
	public Contato incluirContato(@Valid @RequestBody Contato newContato) {
		return contatoService.incluirContato(newContato);
	}

	@GetMapping
	public List<Contato> buscarContato() {
		return contatoService.buscarContato();
	}

	@GetMapping("/{id}")
	public Contato buscarUniContato(@PathVariable Integer id) {
		return contatoService.buscarUniContato(id);
	}

	@PutMapping("/{id}")
	public Contato alterarContato(@PathVariable Integer id, @RequestBody Contato altContato) {
		return contatoService.alterarContato(id, altContato);
	}

	@DeleteMapping("/{id}")
	public Contato excluirContato(@PathVariable Integer id) {
		return contatoService.excluirContato(id);
	}

}
