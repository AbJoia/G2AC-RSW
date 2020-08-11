package modelo.contas;

public abstract class Funcionario extends Usuario {	
	
	private String cargo;

	public Funcionario(String nome, String cpf, String senha, String cargo) {
		super(nome, cpf, senha);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}	
	
}
