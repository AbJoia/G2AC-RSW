package org.g2ac.backend.ProjetoFinal.controller;

import java.util.List;

import javax.validation.Valid;

import org.g2ac.backend.ProjetoFinal.entity.Pedido;
import org.g2ac.backend.ProjetoFinal.exceptions.DataNotFoundException;
import org.g2ac.backend.ProjetoFinal.service.PedidoService;
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
	private PedidoService pedidoService;

	@PostMapping
	public Pedido incluirPedido(@Valid @RequestBody Pedido newPedido) {
		return pedidoService.incluirPedido(newPedido);
	}

	@GetMapping
	public List<Pedido> buscarPedido() {
		return pedidoService.buscarPedido();
	}

	@GetMapping("/{id}")
	public Pedido buscarUniPedido(@PathVariable Integer id)throws DataNotFoundException{
		return pedidoService.buscarUniPedido(id);
	}

	@PutMapping("/{id}")
	public Pedido alterarPedido(@Valid @PathVariable Integer id, @RequestBody Pedido altPedido)throws DataNotFoundException {
		return pedidoService.alterarPedido(id, altPedido);
	}

	@DeleteMapping("/{id}")
	public Pedido excluirPedido(@PathVariable Integer id)throws DataNotFoundException {
		return pedidoService.excluirPedido(id);
	}

}
