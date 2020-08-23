package org.g2ac.backend.ProjetoFinal.controller;

import java.util.List;

import javax.validation.Valid;

import org.g2ac.backend.ProjetoFinal.entity.Endereco;
import org.g2ac.backend.ProjetoFinal.service.EnderecoService;
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

	@PostMapping
	public Endereco incluirEndereco(@Valid @RequestBody Endereco newEndereco) {
		return enderecoService.incluirEndereco(newEndereco);
	}

	@GetMapping
	public List<Endereco> buscarEndereco() {
		return enderecoService.buscarEndereco();
	}

	@GetMapping("/{id}")
	public Endereco buscarUniEndereco(@PathVariable Integer id) {
		return enderecoService.buscarUniEndereco(id);
	}

	@PutMapping("/{id}")
	public Endereco alterarEndereco(@PathVariable Integer id, @RequestBody Endereco altEndereco) {
		return enderecoService.alterarEndereco(id, altEndereco);
	}

	@DeleteMapping("/{id}")
	public Endereco excluirEndereco(@PathVariable Integer id) {
		return enderecoService.excluirEndereco(id);
	}
}
