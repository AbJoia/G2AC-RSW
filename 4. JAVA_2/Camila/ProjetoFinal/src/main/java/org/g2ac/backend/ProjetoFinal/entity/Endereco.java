package org.g2ac.backend.ProjetoFinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_endereco;

	@NotNull
	@Size(min = 9, max = 9)
	@Column(name = "cep", nullable = false, length = 9)
	private String cep;

	@NotNull
	@Size(min = 2, max = 50)
	@Column(name = "rua", nullable = false, length = 50)
	private String rua;

	@NotNull
	@Size(min = 1, max = 5)
	@Column(name = "numero", nullable = false, length = 5)
	private String numero;

	@NotNull
	@Size(min = 3, max = 25)
	@Column(name = "bairro", nullable = false, length = 25)
	private String bairro;

	@NotNull
	@Size(min = 3, max = 25)
	@Column(name = "cidade", nullable = false, length = 25)
	private String cidade;

	@NotNull
	@Size(min = 2, max = 2)
	@Column(name = "estado", nullable = false, length = 2)
	private String estado;

	public Integer getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Integer id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
