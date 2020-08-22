package org.g2ac.javabackend.projetofinal.entities;

import java.util.Date;

public class Produto {

	private Integer produtoID; 
	private Date fabricacao; 
	private Double valorUnidade; 
	private Integer estoque; 
	private String nome; 
	private String descricao; 
	private Usuario uVendedorFK; 
	private Categoria fkCategoria;
	
	public Integer getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(Integer produtoID) {
		this.produtoID = produtoID;
	}
	public Date getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	public Double getValorUnidade() {
		return valorUnidade;
	}
	public void setValorUnidade(Double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getFkUsuario() {
		return uVendedorFK;
	}
	public void setFkUsuario(Usuario fkUsuario) {
		this.uVendedorFK = fkUsuario;
	}
	public Categoria getFkCategoria() {
		return fkCategoria;
	}
	public void setFkCategoria(Categoria fkCategoria) {
		this.fkCategoria = fkCategoria;
	}	
}
