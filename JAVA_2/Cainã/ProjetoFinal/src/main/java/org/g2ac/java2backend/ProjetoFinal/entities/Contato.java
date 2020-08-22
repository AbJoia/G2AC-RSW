package org.g2ac.java2backend.ProjetoFinal.entities;

import javax.persistence.Entity;

@Entity
public class Contato {
	
	private Integer idContato;
	private String ddd;
	private String fixo;
	private String movel;
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