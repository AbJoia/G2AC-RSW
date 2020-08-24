package org.g2ac.javabackend.projetofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ItemPedido")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ItemPedidoID;
	
	@NotNull
	@Size(min = 1)
	@Column(name = "Quantidade", nullable = false, length = 10)
	private Integer quantidade; 
	
	@NotNull
	@Digits(integer = 99999999, fraction = 2)
	@Column(name = "preco", nullable = false, length = 10)
	private double preco;
	
	@ManyToOne
	@JoinColumn(name = "fkProdutoID", nullable = false, referencedColumnName = "produtoID")
	private Produto fkProdutoID;

	public Integer getItemPedidoID() {
		return ItemPedidoID;
	}

	public void setItemPedidoID(Integer identificador) {
		ItemPedidoID = identificador;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getFkProdutoID() {
		return fkProdutoID;
	}

	public void setFkProdutoID(Produto fkProdutoID) {
		this.fkProdutoID = fkProdutoID;
	} 
}
