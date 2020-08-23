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
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarioID;
	
	@NotNull
	@Size(min = 5)
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
	@Column(name = "NickName", nullable = false, length = 15, unique = true)
	private String nickname; 
	
	@NotNull
	@Past
	@Column(name = "dataNascimento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento; 
	
	@ManyToOne
	@JoinColumn(name = "fkEnderecoID", nullable = false, referencedColumnName = "enderecoID")
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
