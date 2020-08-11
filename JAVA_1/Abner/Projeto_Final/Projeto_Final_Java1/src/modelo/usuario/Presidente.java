package modelo.usuario;

public class Presidente extends Funcionario {

	public Presidente(String nome, String cpf, String senha, String cargo) {
		super(nome, cpf, senha, cargo);
	}

	public void relatorioClienteDasAgencia() {
		// falta implementar
	}

	public void relatorioTotalCapital() {
		// falta implementar
	}

	@Override
	public boolean validarUsuario(String cpf, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
