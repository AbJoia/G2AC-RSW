package org.g2ac.backend.ProjetoFinal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_produto;

	@NotNull
	@Size(min = 5, max = 50)
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;

	@Size(min = 5, max = 100)
	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

	@NotNull
	@Column(name = "quantidade_estoque", nullable = false)
	private Integer quantidade_estoque;

	@NotNull
	@Column(name = "valor_unidade", nullable = false, length = 20)
	private Double valor_unidade;

	@Past
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "data_fabricacao", nullable = false)
	private Date data_fabricacao;

	@ManyToOne()
	@JoinColumn(name = "FK_IdUsuario", referencedColumnName = "id_usuario")
	private Usuario usuario;

	@ManyToOne()
	@JoinColumn(name = "FK_IdCategoria", referencedColumnName = "id_categoria")
	private Categoria categoria;

	public Integer getId_produto() {
		return id_produto;
	}

	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}

	public Date getData_fabricacao() {
		return data_fabricacao;
	}

	public void setData_fabricacao(Date data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}

	public Double getValor_unidade() {
		return valor_unidade;
	}

	public void setValor_unidade(Double valor_unidade) {
		this.valor_unidade = valor_unidade;
	}

	public Integer getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(Integer quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
