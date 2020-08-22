package org.g2ac.java2backend.ProjetoFinal.services;

import java.util.List;

import org.g2ac.java2backend.ProjetoFinal.entities.Categoria;
import org.g2ac.java2backend.ProjetoFinal.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getCategorias() {
		return categoriaRepository.findAll();
	}
	
	public Categoria getCategoria(Integer id) {
		if(categoriaRepository.existsById(id)) {
			return categoriaRepository.getOne(id);
		}
		return null;
	}
	
	public void insertCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	public Categoria updateCategoria(Integer id, Categoria newCategoria) {
		Categoria categoriaEncontrada = getCategoria(id);
		categoriaEncontrada.setNome(newCategoria.getNome());
		categoriaEncontrada.setDescricao(newCategoria.getDescricao());
		return categoriaEncontrada;
	}
	
	public void deleteCategoria(Integer id) {
		categoriaRepository.delete(getCategoria(id));
	}
}
