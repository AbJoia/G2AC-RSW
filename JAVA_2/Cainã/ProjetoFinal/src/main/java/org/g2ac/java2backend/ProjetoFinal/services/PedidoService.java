package org.g2ac.java2backend.ProjetoFinal.services;

import java.util.List;

import org.g2ac.java2backend.ProjetoFinal.entities.Pedido;
import org.g2ac.java2backend.ProjetoFinal.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> getPedidos() {
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedido(Integer id) {
		if(pedidoRepository.existsById(id)) {
			return pedidoRepository.getOne(id);
		}
		return null;
	}
	
	public void insertPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
	}
	
	public Pedido updatePedido(Integer id, Pedido newPedido) {
		Pedido pedidoEncontrado = getPedido(id);
		pedidoEncontrado.setDataRealizado(newPedido.getDataRealizado());
		pedidoEncontrado.setUsuario(newPedido.getUsuario());
		return pedidoEncontrado;
	}
	
	public void deletePedido(Integer id) {
		pedidoRepository.delete(getPedido(id));
	}
}
