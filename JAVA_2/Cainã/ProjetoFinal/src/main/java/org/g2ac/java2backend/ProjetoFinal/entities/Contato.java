package org.g2ac.java2backend.ProjetoFinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Contato")
public class Contato {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idContato;
	
	@NotNull
	@Size (min = 2)
	@Column (name = "ddd", nullable = false, length = 2)
	private String ddd;
	
	@Size (min = 8)
	@Column (name = "fixo", length = 8, unique = true)
	private String fixo;
	
	@Size (min = 9)
	@Column (name = "movel", length = 9, unique = true)
	private String movel;
	
	@NotNull
	@ManyToOne ()
	@JoinColumn (name = "usuario", referencedColumnName = "idUsuario")
	private Usuario usuario;
	
	public Integer getIdContato() {
		return idContato;
	}
	
	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}
	
	public String getDdd() {
		return ddd;
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	public String getFixo() {
		return fixo;
	}
	
	public void setFixo(String fixo) {
		this.fixo = fixo;
	}
	
	public String getMovel() {
		return movel;
	}
	
	public void setMovel(String movel) {
		this.movel = movel;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}