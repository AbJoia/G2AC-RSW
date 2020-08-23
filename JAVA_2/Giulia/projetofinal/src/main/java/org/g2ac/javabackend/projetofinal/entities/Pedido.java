package org.g2ac.javabackend.projetofinal.entities;

import java.util.Date;

import javax.persistence.Column;
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

@Entity
@Table(name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pedidoID; 
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataRealizada", nullable = false)
	private Date dataRealizada; 
	
	@ManyToOne
	@JoinColumn(name = "fkUsuarioIDc", nullable = false, referencedColumnName = "usuarioID")
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
