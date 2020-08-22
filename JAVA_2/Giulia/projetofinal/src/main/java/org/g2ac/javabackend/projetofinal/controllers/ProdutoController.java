package org.g2ac.javabackend.projetofinal.controllers;

import java.util.List;

import org.g2ac.javabackend.projetofinal.entities.Produto;
import org.g2ac.javabackend.projetofinal.services.ProdutoService;
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
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService pdService; 
	
	@GetMapping
	public List<Produto> home() {
		return pdService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Produto especificoID(@PathVariable Integer id) {
		return pdService.buscarPorID(id);
	}
	
	@PostMapping
	public Produto add(@RequestBody Produto corpo) {
		return pdService.adicionar(corpo);
	}
	
	@PutMapping("/{id}")
	public Produto update(@PathVariable Integer id, @RequestBody Produto novo) {
		return pdService.atualizar(id, novo);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pdService.deletar(id);
	}
}
