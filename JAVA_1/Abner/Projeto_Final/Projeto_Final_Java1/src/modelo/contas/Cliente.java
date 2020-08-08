package modelo.contas;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String senha;
	private boolean seguroVida = false;
	
	
	public Cliente(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public boolean getSegurodeVida() {
		return this.seguroVida;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public boolean contratoSeguroVida() {
		this.seguroVida = true;
		return this.seguroVida;
	}
}
