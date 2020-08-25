package org.g2ac.javabackend.projetofinal.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarioID;
	
	@NotNull
	@Size(min = 1)
	@Column(name = "Nome", nullable = false)
	private String nome; 
	
	@NotNull
	@Size(min = 11)
	@Column(name = "Cpf", nullable = false, length = 11, unique = true)
	private String cpf; 
	
	@NotNull
	@Size(min = 5)
	@Column(name = "Email", nullable = false, unique = true)
	private String email; 
	
	@NotNull
	@Size(min = 3, max = 15)
	@Column(name = "NomeUsuario", nullable = false, length = 15, unique = true)
	private String nickname; 
	
	@NotNull
	@Past
	@Column(name = "dataNascimento", nullable = false)
	@Temporal(TemporalType.DATE)
	@JsonFormat(timezone = "America/Sao_Paulo")
	private Date dataNascimento; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEndereco", nullable = false, referencedColumnName = "enderecoID")
	private Endereco fkEndereco;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="idContato")
	private Contato contatoObj;

	public Contato getContatoObj() {
		return contatoObj;
	}

	public void setContatoObj(Contato contatoObj) {
		this.contatoObj = contatoObj;
	}

	public Integer getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(Integer usuarioID) {
		this.usuarioID = usuarioID;
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

	public Endereco getFkEndereco() {
		return fkEndereco;
	}

	public void setFkEndereco(Endereco fkEndereco) {
		this.fkEndereco = fkEndereco;
	}
}
