package org.g2ac.java2backend.ProjetoFinal.controllers;

import java.util.List;

import org.g2ac.java2backend.ProjetoFinal.entities.Endereco;
import org.g2ac.java2backend.ProjetoFinal.services.EnderecoService;
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
	private EnderecoService enderecoService;
	
	@GetMapping
	public List<Endereco> getEnderecos() {
		return enderecoService.getEnderecos();
	}
	
	@GetMapping("/{id}")
	public Endereco getEndereco(@PathVariable Integer id) {
		return enderecoService.getEndereco(id);
	}
	
	@PostMapping
	public void insertEndereco(@RequestBody Endereco endereco) {
		enderecoService.insertEndereco(endereco);
	}
	
	@PutMapping("/{id}")
	public Endereco updateEndereco(@PathVariable Integer id, @RequestBody Endereco newEndereco) {
		return enderecoService.updateEndereco(id, newEndereco);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable Integer id) {
		enderecoService.deleteEndereco(id);
	}
}
