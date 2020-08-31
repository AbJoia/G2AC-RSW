package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;
import java.util.Optional;

import org.g2ac.backend.ProjetoFinal.entity.Produto;
import org.g2ac.backend.ProjetoFinal.exceptions.DataNotFoundException;
import org.g2ac.backend.ProjetoFinal.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Transactional
	public Produto incluirProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public List<Produto> buscarProduto() {
		return produtoRepository.findAll();
	}

	public Produto buscarUniProduto(Integer id) throws DataNotFoundException{
		Optional<Produto> optionalProduto = produtoRepository.findById(id);
		if(optionalProduto.isPresent()) {
			return optionalProduto.get();
		}
		throw new DataNotFoundException(id);
	}

	@Transactional
	public Produto alterarProduto(Integer id, Produto altProduto) throws DataNotFoundException{
		Produto produto = buscarUniProduto(id);
		produto.setNome(altProduto.getNome());
		produto.setDescricao(altProduto.getDescricao());
		produto.setValor_unidade(altProduto.getValor_unidade());
		produto.setQuantidade_estoque(altProduto.getQuantidade_estoque());
		produto.setData_fabricacao(altProduto.getData_fabricacao());

		return produtoRepository.save(produto);
	}

	public Produto excluirProduto(Integer id)throws DataNotFoundException {
		Produto produto = buscarUniProduto(id);
		produtoRepository.delete(produto);
		return produto;

	}

}
