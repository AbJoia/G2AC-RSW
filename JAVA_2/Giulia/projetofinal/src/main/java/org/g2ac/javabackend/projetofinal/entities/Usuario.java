package org.g2ac.javabackend.projetofinal.entities;

import java.util.Date;

public class Usuario {

	private Integer usuarioID;
	private String nome; 
	private String cpf; 
	private String email; 
	private String nickname; 
	private Date dataNascimento; 
	private Endereco fkEndereco;
	
	public Integer getIdentificador() {
		return usuarioID;
	}
	public void setIdentificador(Integer identificador) {
		this.usuarioID = identificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getFkID() {
		return fkEndereco;
	}
	public void setFkID(Endereco fkID) {
		this.fkEndereco = fkID;
	} 
}
