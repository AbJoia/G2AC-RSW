package org.g2ac.javabackend.projetofinal.entities;

import java.util.Date;

public class Pedido {

	private Integer pedidoID; 
	private Date dataRealizada; 
	private Usuario uCompradorFK;
	
	public Integer getIdentificador() {
		return pedidoID;
	}
	public void setIdentificador(Integer identificador) {
		this.pedidoID = identificador;
	}
	public Date getDataRealizada() {
		return dataRealizada;
	}
	public void setDataRealizada(Date dataRealizada) {
		this.dataRealizada = dataRealizada;
	}
	public Usuario getFkUsuario() {
		return uCompradorFK;
	}
	public void setFkUsuario(Usuario fkUsuario) {
		this.uCompradorFK = fkUsuario;
	} 
}
