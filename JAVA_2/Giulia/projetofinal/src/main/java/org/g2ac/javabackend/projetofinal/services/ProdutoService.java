package org.g2ac.javabackend.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.g2ac.javabackend.projetofinal.entities.Produto;
import org.g2ac.javabackend.projetofinal.repositories.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepositorio pdRepositorio; 
	
	public Produto procuraID(Integer id) {
		Optional<Produto> pOp = pdRepositorio.findById(id);
		if(pOp.isPresent()) {
			return pOp.get();
		}
		return null;
	}
	
	public List<Produto> buscarTodos() {
		return pdRepositorio.findAll();
	}
	
	public Produto buscarPorID(Integer id) {
		return procuraID(id);
	}
	
	public Produto adicionar(Produto corpo) {
		return pdRepositorio.save(corpo);
	}
	
	public void deletar(Integer id) {
		Produto achou = procuraID(id);
		pdRepositorio.delete(achou);
	}
	
	public Produto atualizar(Integer id, Produto novo) {
		Produto achou = procuraID(id);
		achou.setValorUnidade(novo.getValorUnidade());
		achou.setEstoque(novo.getEstoque());
		achou.setNome(novo.getNome());
		achou.setDescricao(novo.getDescricao());
		return pdRepositorio.save(achou);
	}
}

