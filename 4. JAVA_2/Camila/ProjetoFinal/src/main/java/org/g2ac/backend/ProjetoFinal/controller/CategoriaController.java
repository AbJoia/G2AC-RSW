package org.g2ac.backend.ProjetoFinal.controller;

import java.util.List;

import javax.validation.Valid;

import org.g2ac.backend.ProjetoFinal.entity.Categoria;
import org.g2ac.backend.ProjetoFinal.exceptions.DataNotFoundException;
import org.g2ac.backend.ProjetoFinal.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")

public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;

	@PostMapping
	public Categoria incluirCategoria(@Valid @RequestBody Categoria newCategoria) {
		return categoriaService.incluirCategoria(newCategoria);
	}

	@GetMapping
	public List<Categoria> buscarCategoria(){
		return categoriaService.buscarCategoria();
	}

	@GetMapping("/{id}")
	public Categoria buscarUniCategoria(@PathVariable Integer id) throws DataNotFoundException {
		return categoriaService.buscarUniCategoria(id);
	}

	@PutMapping("/{id}")
	public Categoria alterarCategoria(@Valid @PathVariable Integer id, @RequestBody Categoria altCategoria) throws DataNotFoundException {
		return categoriaService.alterarCategoria(id, altCategoria);
	}

	@DeleteMapping("/{id}")
	public Categoria excluirCategoria(@PathVariable Integer id) throws DataNotFoundException{
		return categoriaService.excluirCategoria(id);
	}

}
