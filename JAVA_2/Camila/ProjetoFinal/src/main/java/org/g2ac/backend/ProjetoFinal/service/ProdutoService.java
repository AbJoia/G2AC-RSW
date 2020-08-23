package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;

import org.g2ac.backend.ProjetoFinal.Repository.ProdutoRepository;
import org.g2ac.backend.ProjetoFinal.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto incluirProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public List<Produto> buscarProduto() {
		return produtoRepository.findAll();
	}

	public Produto buscarUniProduto(Integer id) {
		if (produtoRepository.existsById(id)) {
			return produtoRepository.findById(id).get();
		}
		return null;
	}

	public Produto alterarProduto(Integer id, Produto altProduto) {
		Produto produto = buscarUniProduto(id);
		produto.setNome(altProduto.getNome());
		produto.setDescricao(altProduto.getDescricao());
		produto.setValor_unidade(altProduto.getValor_unidade());
		produto.setQuantidade_estoque(altProduto.getQuantidade_estoque());
		produto.setData_fabricacao(altProduto.getData_fabricacao());

		return produtoRepository.save(produto);
	}

	public Produto excluirProduto(Integer id) {
		Produto produto = buscarUniProduto(id);
		produtoRepository.delete(produto);
		return produto;

	}

}
