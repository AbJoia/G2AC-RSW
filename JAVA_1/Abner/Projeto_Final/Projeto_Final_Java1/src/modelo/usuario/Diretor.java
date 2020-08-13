package modelo.usuario;

public class Diretor extends Funcionario {	
	
	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = "Diretor";
	}	
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void relatorioClienteDasAgencia() {
		// falta implementar
	}
}
