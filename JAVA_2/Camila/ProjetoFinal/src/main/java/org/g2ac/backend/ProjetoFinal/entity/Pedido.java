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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pedido;

	@NotNull
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "data_realizado", nullable = false)
	private Date data_realizado;

	@ManyToOne
	@JoinColumn(name = "FK_IdUsuario", referencedColumnName = "id_usuario")
	private Usuario usuario;

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
