package org.g2ac.backend.ProjetoFinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;

import com.sun.istack.NotNull;

@Entity
@Table(name = "RelatorioPedido")
public class RelatorioPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_relatorioPedido;

	@NotNull
	@Column(name = "nome", nullable = false)
	private Integer quantidade;

	@Valid
	@ManyToOne
	@JoinColumn(name = "FK_IdProduto", referencedColumnName = "id_produto")
	private Produto produto;

	public Integer getId_relatorioPedido() {
		return id_relatorioPedido;
	}

	public void setId_relatorioPedido(Integer id_relatorioPedido) {
		this.id_relatorioPedido = id_relatorioPedido;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


}
