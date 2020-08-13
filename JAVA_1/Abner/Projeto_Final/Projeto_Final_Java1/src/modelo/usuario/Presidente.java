package modelo.usuario;

public class Presidente extends Funcionario {	
	
	
	public Presidente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = "Presidente";
	}
	
	public String getCargo() {
		return this.cargo;
	}

	public void relatorioClienteDasAgencia() {
		// falta implementar
	}

	public void relatorioTotalCapital() {
		// falta implementar
	}
}
