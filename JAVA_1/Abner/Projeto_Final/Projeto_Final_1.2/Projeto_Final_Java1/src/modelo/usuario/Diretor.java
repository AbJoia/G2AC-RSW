package modelo.usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import modelo.contas.*;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = "Diretor";
	}

	public String getCargo() {
		return this.cargo;
	}

	public void relatorioDiretor(Map<String, ContaCorrente> contaCorrente, Map<String, ContaPoupanca> contaPoupanca) {

		Set<String> cc = contaCorrente.keySet();
		Set<String> cp = contaPoupanca.keySet();

		ArrayList<String> info = new ArrayList<>();

		for (String c : cc) {

			String linha = ((Map<String, ContaCorrente>) contaCorrente).get(c).getTitular().getNome() + " - "
					+ ((Map<String, ContaCorrente>) contaCorrente).get(c).getTitular().formatCpf() + " - "
					+ ((Map<String, ContaCorrente>) contaCorrente).get(c).getIdAgencia().getNumeroAgencia();

			info.add(linha);

		}

		for (String c : cp) {

			String linha = ((Map<String, ContaPoupanca>) contaPoupanca).get(c).getTitular().getNome() + " - "
					+ ((Map<String, ContaPoupanca>) contaPoupanca).get(c).getTitular().formatCpf() + " - "
					+ ((Map<String, ContaPoupanca>) contaPoupanca).get(c).getIdAgencia().getNumeroAgencia();

			info.add(linha);
		}
		
		Collections.sort(info);

		for (String i : info) {
			System.out.println(i);
		}
	}
}
