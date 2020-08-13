package modelo.usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import modelo.contas.ContaCorrente;
import modelo.contas.ContaPoupanca;

public class Presidente extends Funcionario {	
	
	
	public Presidente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = "Presidente";
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

	public void relatorioPresidente(Map<String, ContaCorrente> contaCorrente, Map<String, ContaPoupanca> contaPoupanca) {
		
		Set<String> cc = contaCorrente.keySet();
		Set<String> cp = contaPoupanca.keySet();
		
		Double capitalTotal = 0.0;
		
		for(String c : cc) {
			 capitalTotal += ((Map<String, ContaCorrente>) contaCorrente).get(c).getSaldo();
		}
		
		for(String c : cp) {
			 capitalTotal += ((Map<String, ContaPoupanca>) contaPoupanca).get(c).getSaldo();
		}
		
		System.out.println("Capital total: R$ " + String.format("%.2f", capitalTotal));		
	}
}
