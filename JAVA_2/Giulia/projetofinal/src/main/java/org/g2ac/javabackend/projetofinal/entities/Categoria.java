package org.g2ac.javabackend.projetofinal.entities;

public class Categoria {

	private Integer categoriaID; 
	private String nome; 
	private String descricao;
	
	public Integer getIdentificador() {
		return categoriaID;
	}
	public void setIdentificador(Integer identificador) {
		this.categoriaID = identificador;
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
}
