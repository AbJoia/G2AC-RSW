package modelo.usuario;

public class Diretor extends Funcionario {
	
	public Diretor(String nome, String cpf, String senha, String cargo) {
		super(nome, cpf, senha, cargo);
	}	
	
	public void relatorioClienteDasAgencia() {
		// falta implementar
	}

	@Override
	public boolean validarUsuario(String cpf, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
