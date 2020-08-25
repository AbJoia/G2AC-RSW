package org.g2ac.javabackendMarketplace.projetoFinal.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.g2ac.javabackendMarketplace.projetoFinal.Entity.Item_Pedido;
import org.g2ac.javabackendMarketplace.projetoFinal.Entity.Pedido;
import org.g2ac.javabackendMarketplace.projetoFinal.Exceptions.DataNotFoundException;
import org.g2ac.javabackendMarketplace.projetoFinal.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRep;

	public List<Pedido> getAllPedido() {
		return pedidoRep.findAll();
	}

	public Pedido getPedidoPorId(Integer id) throws DataNotFoundException {
		Optional<Pedido> optional = pedidoRep.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		throw new DataNotFoundException(id);
	}

	@Transactional
	public Pedido insertPedido(Pedido pedido) {
		pedido.setData_Pedido(new Date());		
		return pedidoRep.save(pedido);
	}

	@Transactional
	public Pedido updatePedido(Integer id, Pedido pedido) throws DataNotFoundException {
		Pedido pedidoEncontrado = getPedidoPorId(id);
		pedidoEncontrado.setData_Pedido(pedido.getData_Pedido());
		pedidoEncontrado.setUsuario(pedido.getUsuario());
		return insertPedido(pedidoEncontrado);
	}

	public Pedido deletePedido(Integer id) throws DataNotFoundException {
		Pedido pedidoEncontrado = getPedidoPorId(id);
		pedidoRep.delete(pedidoEncontrado);
		return pedidoEncontrado;
	}
}
