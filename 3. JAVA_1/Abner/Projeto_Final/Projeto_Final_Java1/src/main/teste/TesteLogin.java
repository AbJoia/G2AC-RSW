package main.teste;

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

		String cpf = "76532189065";
		String senha = "5619";
		

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
		} else {
			System.out.println("Não Cadastrado!");
		}
	}
}
