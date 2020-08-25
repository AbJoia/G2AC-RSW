package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;

import org.g2ac.backend.ProjetoFinal.Repository.CategoriaRepository;
import org.g2ac.backend.ProjetoFinal.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria incluirCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public List<Categoria> buscarCategoria(String nome) {
		return categoriaRepository.findAll(Sort.by(nome));
	}
	
	public Categoria buscarUniCategoria(Integer id) {
		if(categoriaRepository.existsById(id)) {
			return categoriaRepository.findById(id).get();
		}
		return null;
	}
	
	public Categoria alterarCategoria(Integer id, Categoria altCategoria) {
		Categoria categoria = buscarUniCategoria(id);
		categoria.setDescricao(altCategoria.getDescricao());
		categoria.setNome(altCategoria.getNome());
		return categoriaRepository.save(categoria);
	}
	
	public Categoria excluirCategoria(Integer id) {
		Categoria categoria = buscarUniCategoria(id);
		categoriaRepository.delete(categoria);
		return categoria;
	
	}

}
