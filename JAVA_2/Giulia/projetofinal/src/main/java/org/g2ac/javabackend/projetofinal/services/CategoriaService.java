package org.g2ac.javabackend.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.g2ac.javabackend.projetofinal.entities.Categoria;
import org.g2ac.javabackend.projetofinal.repositories.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepositorio caRepositorio;
	
	public Categoria procuraID(Integer id) {
		Optional<Categoria> caOp = caRepositorio.findById(id);
		if(caOp.isPresent()) {
			return caOp.get();
		}
		return null;
	}
	
	public List<Categoria> buscarTodos(){
		return caRepositorio.findAll();
	}
	
	public Categoria buscarPorID(Integer id) {
		return procuraID(id);
	}
	
	public Categoria adicionar(Categoria corpo) {
		return caRepositorio.save(corpo);
	}
	
	public void deletar(Integer id) {
		Categoria achou = procuraID(id);
		caRepositorio.delete(achou);
	}
	
	public Categoria atualizar(Integer id, Categoria novo) {
		Categoria achou = procuraID(id);
		achou.setNome(novo.getNome());
		achou.setDescricao(novo.getDescricao());
		return caRepositorio.save(achou);
	}
}
