package org.g2ac.javabackend.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.g2ac.javabackend.projetofinal.entities.ItemPedido;
import org.g2ac.javabackend.projetofinal.exceptions.ObjectNotFoundException;
import org.g2ac.javabackend.projetofinal.repositories.ItemPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemPedidoService {

	@Autowired
	private ItemPedidoRepositorio repoItemPedido; 
	
	public ItemPedido procuraID(Integer id) throws ObjectNotFoundException {
		Optional<ItemPedido> ipOptional = repoItemPedido.findById(id);
		if(ipOptional.isPresent()) {
			return ipOptional.get();
		}
		throw new ObjectNotFoundException(id);
	}
	
	public List<ItemPedido> buscarTodos() {
		return repoItemPedido.findAll();
	}
	
	public ItemPedido buscaPorID(Integer id) throws ObjectNotFoundException {
		return procuraID(id);
	}
	
	@Transactional
	public ItemPedido adicionar(ItemPedido corpo) {
		return repoItemPedido.save(corpo);
	}
	
	public void deletar(Integer id) throws ObjectNotFoundException {
		ItemPedido achou = procuraID(id);
		repoItemPedido.delete(achou);
	}
	
	@Transactional
	public ItemPedido atualizar(Integer id, ItemPedido novo) throws ObjectNotFoundException {
		ItemPedido achou = procuraID(id);
		achou.setQuantidade(novo.getQuantidade());
		return repoItemPedido.save(achou);
	}	
}
