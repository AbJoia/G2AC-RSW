package org.g2ac.javabackend.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.g2ac.javabackend.projetofinal.entities.Pedido;
import org.g2ac.javabackend.projetofinal.repositories.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepositorio pRepositorio; 
	
	public Pedido procuraID(Integer id) {
		Optional<Pedido> pOptional = pRepositorio.findById(id);
		if(pOptional.isPresent()) {
			return pOptional.get();
		}
		return null;
	}
	
	public List<Pedido> buscarTodos(){
		return pRepositorio.findAll();
	}
	
	public Pedido buscarPorID(Integer id) {
		return procuraID(id);
	}
	
	public Pedido adicionar(Pedido corpo) {
		return pRepositorio.save(corpo);
	}
	
	public void deletar(Integer id) {
		Pedido achou = procuraID(id);
		pRepositorio.delete(achou);
	}
	
	public Pedido atualizar(Integer id, Pedido novo) {
		Pedido achou = procuraID(id);
		achou.setDataRealizada(novo.getDataRealizada());
		return pRepositorio.save(achou);		
	}
}
