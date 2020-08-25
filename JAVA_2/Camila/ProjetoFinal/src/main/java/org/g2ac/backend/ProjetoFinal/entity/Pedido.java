package org.g2ac.backend.ProjetoFinal.entity;

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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pedido;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Sao_Paulo")
	@Column(name = "data_realizado", nullable = true)
	private Date data_realizado;

	@ManyToOne()
	@JoinColumn(name = "FK_Usuario_comprador", referencedColumnName = "id_usuario")
	private Usuario usuario;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_ItemPedido")
	private Set<RelatorioPedido> Item;

	public Usuario getUsuario_comprador() {
		return usuario;
	}

	public void setUsuario_comprador(Usuario usuario_comprador) {
		this.usuario = usuario_comprador;
	}

	public Set<RelatorioPedido> getItem() {
		return Item;
	}

	public void setItem(Set<RelatorioPedido> item) {
		Item = item;
	}

	public Integer getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Date getData_realizado() {
		return data_realizado;
	}

	public void setData_realizado(Date data_realizado) {
		this.data_realizado = data_realizado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
