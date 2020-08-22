package org.g2ac.javabackend.projetofinal.entities;

public class Contato {

	private Integer contatoID; 
	private String ddd; 
	private String fixo; 
	private String celular; 
	private Usuario fkUsuario;
	
	public Integer getIdentificador() {
		return contatoID;
	}
	public void setIdentificador(Integer identificador) {
		this.contatoID = identificador;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Usuario getFkID() {
		return fkUsuario;
	}
	public void setFkID(Usuario fkID) {
		this.fkUsuario = fkID;
	} 
}
