package modelo.usuario;

import java.util.List;
import contas.Agencia;

public class Gerente extends Funcionario {	
	
	private Agencia agencia;
	
	
	public Gerente(String nome, String cpf, String senha, Agencia agencia) {
		super(nome, cpf, senha);
		this.agencia = agencia;
		this.cargo = "Gerente";
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void relatorioContasNaAgencia(List contas) {		
		int contador = 0;
		for(int i = 0; i < contas.size(); i++) {
			if(this.agencia.getNumeroAgencia() == contas.get(i)) {
				contador += 1;
			}
		}
		System.out.println("A agência a qual esse gerente é responsável possui " + contador + " contas.");
	}			
}
