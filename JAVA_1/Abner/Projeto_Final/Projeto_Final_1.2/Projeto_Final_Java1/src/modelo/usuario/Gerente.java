package modelo.usuario;

import java.util.*;

import contas.Agencia;
import modelo.contas.*;

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

	public void relatorioGerente(Map<String, ContaCorrente> contaCorrente,
			Map<String, ContaPoupanca> contaPoupanca) {

		Set<String> cc = contaCorrente.keySet();
		Set<String> cp = contaPoupanca.keySet();

		int contadorCorrente = 0;
		int contadorPoupanca = 0;
		for (String c : cc) {
			if (contaCorrente.get(c).getIdAgencia().getNumeroAgencia() == this.agencia.getNumeroAgencia()) {
				contadorCorrente += 1;
			}
		}

		for (String c : cp) {
			if (contaPoupanca.get(c).getIdAgencia().getNumeroAgencia() == this.agencia.getNumeroAgencia()) {
				contadorPoupanca += 1;
			}
		}

		System.out.println("Agência [" + agencia.getNumeroAgencia() + "] a qual " + getNome() + " é responsável possui "
				+ (contadorCorrente + contadorPoupanca) + " conta(s). \nSendo, " + contadorCorrente + " Conta(s) Corrente(s) e " + contadorPoupanca
				+ " Conta(s) Poupança(s)");
	}
}
