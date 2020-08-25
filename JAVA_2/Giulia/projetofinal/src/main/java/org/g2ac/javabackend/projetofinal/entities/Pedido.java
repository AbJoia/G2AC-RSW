package org.g2ac.javabackend.projetofinal.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pedidoID;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(timezone = "America/Sao_Paulo")
	@Column(name = "dataRealizada", nullable = false)
	private Date dataRealizada;

	@ManyToOne
	@JoinColumn(name = "uComprador", nullable = false, referencedColumnName = "usuarioID")
	private Usuario uCompradorFK;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkPedido")
	private Set<ItemPedido> itemPedido;

	public Integer getPedidoID() {
		return pedidoID;
	}

	public void setPedidoID(Integer identificador) {
		this.pedidoID = identificador;
	}

	public Date getDataRealizada() {
		return dataRealizada;
	}

	public void setDataRealizada(Date dataRealizada) {
		this.dataRealizada = dataRealizada;
	}

	public Usuario getuCompradorFK() {
		return uCompradorFK;
	}

	public void setuCompradorFK(Usuario uCompradorFK) {
		this.uCompradorFK = uCompradorFK;
	}

	public Set<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(Set<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
}
