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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer produtoID; 
	
	@NotNull
	@Past
	@Temporal(TemporalType.DATE)
	@Column(name = "Fabricado", nullable = false)
	@JsonFormat(timezone = "America/Sao_Paulo")
	private Date fabricacao; 
	
	@NotNull
	@Column(name = "ValorUnidade", nullable = false)
	private Double valorUnidade; 
	
	@NotNull
	@Column(name = "Estoque", nullable = false)
	private Integer estoque; 
	
	@NotNull
	@Size(min = 5, max = 30)
	@Column(name = "Nome", nullable = false, length = 30)
	private String nome; 
	
	@Size(min = 10, max = 150)
	@Column(name = "Descricao", nullable = true, length = 150)
	private String descricao; 
	
	@ManyToOne
	@JoinColumn(name = "vVendedorID", nullable = false, referencedColumnName = "usuarioID")
	private Usuario uVendedorFK; 
	
	@ManyToOne
	@JoinColumn(name = "fkCategoriaID", nullable = false, referencedColumnName = "categoriaID")
	private Categoria fkCategoria;
	
	public Integer getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(Integer identificador) {
		this.produtoID = identificador;
	}
	public Date getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	public Double getValorUnidade() {
		return valorUnidade;
	}
	public void setValorUnidade(Double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getFkUsuario() {
		return uVendedorFK;
	}
	public void setFkUsuario(Usuario uVendedor) {
		this.uVendedorFK = uVendedor;
	}
	public Categoria getFkCategoria() {
		return fkCategoria;
	}
	public void setFkCategoria(Categoria fkCategoria) {
		this.fkCategoria = fkCategoria;
	}	
}
