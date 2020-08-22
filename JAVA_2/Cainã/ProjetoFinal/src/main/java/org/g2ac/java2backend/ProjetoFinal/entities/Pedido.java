package org.g2ac.java2backend.ProjetoFinal.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Pedido {
	
	private Integer idPedido;
	private Date dataRealizado;
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