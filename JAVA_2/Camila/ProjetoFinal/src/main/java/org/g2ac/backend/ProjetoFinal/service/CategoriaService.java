package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;
import java.util.Optional;

import org.g2ac.backend.ProjetoFinal.entity.Categoria;
import org.g2ac.backend.ProjetoFinal.exceptions.DataNotFoundException;
import org.g2ac.backend.ProjetoFinal.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Transactional
	public Categoria incluirCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public List<Categoria> buscarCategoria() {
		return categoriaRepository.findAll();
	}
	
	public Categoria buscarUniCategoria(Integer id) throws DataNotFoundException{
		Optional<Categoria> optionalCatategoria = categoriaRepository.findById(id);
		if(optionalCatategoria.isPresent()) {
			return optionalCatategoria.get();
		}
		throw new DataNotFoundException(id);
	}
	
	@Transactional
	public Categoria alterarCategoria(Integer id, Categoria altCategoria) throws DataNotFoundException{
		Categoria categoria = buscarUniCategoria(id);
		categoria.setDescricao(altCategoria.getDescricao());
		categoria.setNome(altCategoria.getNome());
		return categoriaRepository.save(categoria);
	}
	
	public Categoria excluirCategoria(Integer id) throws DataNotFoundException{
		Categoria categoria = buscarUniCategoria(id);
		categoriaRepository.delete(categoria);
		return categoria;
	
	}

}
