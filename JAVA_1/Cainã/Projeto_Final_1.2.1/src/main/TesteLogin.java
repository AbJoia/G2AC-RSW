package main;

import modelo.contas.*;
import modelo.usuario.*;
import java.io.*;
import java.util.*;

import Sistema.CarregaArquivo;
import contas.Agencia;

public class TesteLogin {

	public static void main(String[] args) throws IOException {

		CarregaArquivo importa = new CarregaArquivo();

		Map<String, Cliente> mapaCliente = importa.importaCliente();
		Map<Integer, Agencia> mapaAgencia = importa.importaAgencia();
		Map<String, Funcionario> mapaFuncionario = importa.importaFuncionario();
		Map<String, ContaCorrente> mapaContaCorrente = importa.importaContaCorrente();
		Map<String, ContaPoupanca> mapaContaPoupanca = importa.importaContaPoupanca();			

		
		Cliente cliente;
		Gerente gerente;
		Diretor diretor;
		Presidente presidente;

		Login logar = new Login();
		
		//cpf gerente: 34571808230
		//diretor : 24246116978
		
		Cliente c1 = mapaCliente.get("35475628595");
		ContaCorrente cc1 = mapaContaCorrente.get("35475628595");
		
		
		
		Agencia ag1 = mapaAgencia.get(1234);		
		Gerente d1 = (Gerente) mapaFuncionario.get("34571808230");
		Presidente p1 = (Presidente) mapaFuncionario.get("76532189065");
		
		p1.relatorioPresidente(mapaContaCorrente, mapaContaPoupanca);
		cc1.saque(50000);
		p1.relatorioPresidente(mapaContaCorrente, mapaContaPoupanca);
		//p1.relatorioDiretor(mapaContaCorrente, mapaContaPoupanca);		
		
		String cpf = "12332145678";
		String senha = "1234";			

		if (mapaFuncionario.get(cpf) != null) {
			String cargo = mapaFuncionario.get(cpf).getCargo();

			if (cargo.endsWith("Presidente")) {
				presidente = (Presidente) mapaFuncionario.get(cpf);
				if (logar.logar(presidente, senha)) {
					System.out.println("chama tela");
				} else {
					System.out.println("Dados incorretos!");
				}
			} else if (cargo.endsWith("Diretor")) {
				diretor = (Diretor) mapaFuncionario.get(cpf);
				logar.logar(diretor, senha);
				if (logar.logar(diretor, senha)) {
					System.out.println("chama tela");
				} else {
					System.out.println("Dados incorretos!");
				}
			} else {
				gerente = (Gerente) mapaFuncionario.get(cpf);
				logar.logar(gerente, senha);
				if (logar.logar(gerente, senha)) {
					System.out.println("chama tela");
				} else {
					System.out.println("Dados incorretos!");
				}
			}
		} else if (mapaCliente.get(cpf) != null) {
			cliente = (Cliente) mapaCliente.get(cpf);
			logar.logar(cliente, senha);
			System.out.println("chama tela");
		} else {
			System.out.println("Não Cadastrado!");
		}
	}
}
