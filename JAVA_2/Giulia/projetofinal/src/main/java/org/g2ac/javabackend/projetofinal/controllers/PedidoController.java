package org.g2ac.javabackend.projetofinal.controllers;

import java.util.List;

import org.g2ac.javabackend.projetofinal.entities.Pedido;
import org.g2ac.javabackend.projetofinal.services.PedidoService;
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
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pService; 
	
	@GetMapping
	public List<Pedido> home () {
		return pService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Pedido especificoID(@PathVariable Integer id) {
		return pService.buscarPorID(id);
	}
	
	@PostMapping
	public Pedido add(@RequestBody Pedido corpo) {
		return pService.adicionar(corpo);
	}
	
	@PutMapping("/{id}")
	public Pedido update(@PathVariable Integer id, @RequestBody Pedido novo) {
		return pService.atualizar(id, novo);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pService.deletar(id);
	}
	
}
