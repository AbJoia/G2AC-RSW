package org.g2ac.backend.ProjetoFinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_contato;

	@NotNull
	@Size(min = 2)
	@Column(name = "ddd", nullable = false, length = 2)
	private String ddd;

	@NotNull
	@Size(min = 10)
	@Column(name = "movel", nullable = false, length = 10)
	private String movel;

	@Size(min = 2)
	@Column(name = "fixo", nullable = false, length = 10)
	private String fixo;

	@ManyToOne
	@JoinColumn(name = "FK_IdUsuario", referencedColumnName = "id_usuario")
	private Usuario usuario;

	public Integer getId_contato() {
		return id_contato;
	}

	public void setId_contato(Integer id_contato) {
		this.id_contato = id_contato;
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
