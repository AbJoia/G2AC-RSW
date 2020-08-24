package org.g2ac.javabackend.projetofinal.controllers;

import java.util.List;

import javax.validation.Valid;

import org.g2ac.javabackend.projetofinal.entities.ItemPedido;
import org.g2ac.javabackend.projetofinal.exceptions.ObjectNotFoundException;
import org.g2ac.javabackend.projetofinal.services.ItemPedidoService;
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
@RequestMapping("/itempedido")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoService ipService; 
	
	@GetMapping
	public List<ItemPedido> home(){
		return ipService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public ItemPedido especificoID(@PathVariable Integer id) throws ObjectNotFoundException {
		return ipService.buscaPorID(id);
	}
	
	@PostMapping
	public ItemPedido add(@Valid @RequestBody ItemPedido corpo) {
		return ipService.adicionar(corpo);
	}
	
	@PutMapping("/{id}")
	public ItemPedido update(@PathVariable Integer id, @Valid @RequestBody ItemPedido novo) throws ObjectNotFoundException {
		return ipService.atualizar(id, novo);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) throws ObjectNotFoundException {
		ipService.deletar(id);
	}
}
