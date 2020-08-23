package org.g2ac.java2backend.ProjetoFinal.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Integer idPedido;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Sao_Paulo") 
	private Date dataRealizado;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "usuarioComprador", referencedColumnName = "idUsuario")
	private Usuario usuarioComprador;
	
	public Integer getIdPedido() {
		return idPedido;
	}
	
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	
	public Date getDataRealizado() {
		return dataRealizado;
	}
	
	public void setDataRealizado(Date dataRealizado) {
		this.dataRealizado = dataRealizado;
	}
	
	public Usuario getUsuario() {
		return usuarioComprador;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuarioComprador = usuario;
	}
}