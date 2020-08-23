package org.g2ac.javabackend.projetofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ItemPedido")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ItemPedidoID;
	
	@NotNull
	@Column(name = "Quantidade", nullable = false)
	private Integer quantidade; 
	
	@ManyToOne
	@JoinColumn(name = "fkProdutoID", nullable = false, referencedColumnName = "produtoID")
	private Produto fkProdutoID; 
	
	@ManyToOne
	@JoinColumn(name = "fkPedidoID", nullable = false, referencedColumnName = "pedidoID")
	private Pedido fkPedidoID;
	
	public Integer getItemPedidoID() {
		return ItemPedidoID;
	}
	public void setItemPedidoID(Integer itemPedidoID) {
		ItemPedidoID = itemPedidoID;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getFkProdutoID() {
		return fkProdutoID;
	}
	public void setFkProdutoID(Produto fkProdutoID) {
		this.fkProdutoID = fkProdutoID;
	}
	public Pedido getFkPedidoID() {
		return fkPedidoID;
	}
	public void setFkPedidoID(Pedido fkPedidoID) {
		this.fkPedidoID = fkPedidoID;
	}
}
