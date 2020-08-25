package org.g2ac.backend.ProjetoFinal.controller;

import java.util.List;

import javax.validation.Valid;

import org.g2ac.backend.ProjetoFinal.entity.Produto;
import org.g2ac.backend.ProjetoFinal.service.ProdutoService;
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
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;

	@PostMapping
	public Produto incluirProduto(@Valid @RequestBody Produto newProduto) {
		return produtoService.incluirProduto(newProduto);
	}

	@GetMapping
	public List<Produto> buscarProduto() {
		return produtoService.buscarProduto();
	}

	@GetMapping("/{id}")
	public Produto buscarUniProduto(@PathVariable Integer id) {
		return produtoService.buscarUniProduto(id);
	}

	@PutMapping("/{id}")
	public Produto alterarProduto(@PathVariable Integer id, @RequestBody Produto altProduto) {
		return produtoService.alterarProduto(id, altProduto);
	}

	@DeleteMapping("/{id}")
	public Produto excluirProduto(@PathVariable Integer id) {
		return produtoService.excluirProduto(id);
	}

}
