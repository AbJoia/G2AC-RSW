package org.g2ac.backend.ProjetoFinal.entity;

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
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;

	@NotNull
	@Size(min = 3, max = 50)
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;

	@NotNull
	@Size(min = 11, max = 11)
	@Column(name = "cpf", nullable = false, length = 11)
	private String cpf;

	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "nome_usuario", unique = true, nullable = false, length = 50)
	private String nome_usuario;

	@NotNull
	@Email
	@Size(min = 1, max = 50)
	@Column(name = "email", nullable = false, length = 50)
	private String email;

	@NotNull
	@Past
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "data_nascimento", nullable = false)
	private Date data_nascimento;
	
	@Valid
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_IdEndereco", referencedColumnName = "id_endereco")
	private Endereco endereco;
	
	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Contato")
	private Contato contato;
	
	
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
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

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
