package org.g2ac.java2backend.ProjetoFinal.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Produto {

	private Integer idProduto;
	private Date dataFabricacao;
	private Double valorUnidade;
	private Integer quantidadeEstoque;
	private String descricao;
	private String nome;
	private Usuario usuarioVendedor;
	private Categoria categoria;
	
	public Integer getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public Double getValorUnidade() {
		return valorUnidade;
	}
	
	public void setValorUnidade(Double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Usuario getUsuarioVendedor() {
		return usuarioVendedor;
	}
	
	public void setUsuarioVendedor(Usuario usuarioVendedor) {
		this.usuarioVendedor = usuarioVendedor;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}