package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;

import org.g2ac.backend.ProjetoFinal.Repository.PedidoRepository;
import org.g2ac.backend.ProjetoFinal.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido incluirPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public List<Pedido> buscarPedido() {
		return pedidoRepository.findAll();
	}

	public Pedido buscarUniPedido(Integer id) {
		if (pedidoRepository.existsById(id)) {
			return pedidoRepository.findById(id).get();
		}
		return null;
	}

	public Pedido alterarPedido(Integer id, Pedido altPedido) {
		Pedido pedido = buscarUniPedido(id);
		pedido.setData_realizado(altPedido.getData_realizado());
		return pedidoRepository.save(pedido);
	}

	public Pedido excluirPedido(Integer id) {
		Pedido pedido = buscarUniPedido(id);
		pedidoRepository.delete(pedido);
		return pedido;

	}

}
