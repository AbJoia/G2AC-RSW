package org.g2ac.backend.ProjetoFinal.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.g2ac.backend.ProjetoFinal.entity.Pedido;
import org.g2ac.backend.ProjetoFinal.exceptions.DataNotFoundException;
import org.g2ac.backend.ProjetoFinal.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;

	@Transactional
	public Pedido incluirPedido(Pedido pedido) {
		pedido.setData_realizado(new Date());
		return pedidoRepository.save(pedido);
	}

	public List<Pedido> buscarPedido() {
		return pedidoRepository.findAll();
	}

	public Pedido buscarUniPedido(Integer id) throws DataNotFoundException{
		Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
		if(optionalPedido.isPresent()) {
			return optionalPedido.get();
		}
		throw new DataNotFoundException(id);
	}

	@Transactional
	public Pedido alterarPedido(Integer id, Pedido altPedido)throws DataNotFoundException {
		Pedido pedido = buscarUniPedido(id);
		pedido.setData_realizado(altPedido.getData_realizado());
		return pedidoRepository.save(pedido);
	}

	public Pedido excluirPedido(Integer id)throws DataNotFoundException {
		Pedido pedido = buscarUniPedido(id);
		pedidoRepository.delete(pedido);
		return pedido;

	}

}
