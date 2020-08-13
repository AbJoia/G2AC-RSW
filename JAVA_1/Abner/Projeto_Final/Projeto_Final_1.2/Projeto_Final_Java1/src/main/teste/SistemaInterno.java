package main.teste;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import Sistema.CarregaArquivo;
import Sistema.Telas;
import contas.Agencia;
import modelo.contas.*;
import modelo.usuario.*;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		CarregaArquivo importa = new CarregaArquivo();

		Map<String, Cliente> mapaCliente = importa.importaCliente();
		Map<Integer, Agencia> mapaAgencia = importa.importaAgencia();
		Map<String, Funcionario> mapaFuncionario = importa.importaFuncionario();
		Map<String, ContaCorrente> mapaContaCorrente = importa.importaContaCorrente();
		Map<String, ContaPoupanca> mapaContaPoupanca = importa.importaContaPoupanca();

		String cpf;
		String senha;
		int op;

		Telas.telaLogin();
		cpf = sc.next();
		senha = sc.next();
		Usuario usuarioLogado = verificaUsuario(mapaCliente, mapaFuncionario, cpf, senha);
		Conta contaLogada = buscaConta(mapaContaCorrente, mapaContaPoupanca, usuarioLogado);
		op = sc.nextInt();

		while (op != 0) {

			switch (op) {
			case 1:
				Telas.telaSaque();				
				break;
			case 2:
				// deposito;
				break;
			case 3:
				// Transferencia;
				break;
			case 4:
				// Seguro
				break;
			case 5:
				// saldo
				break;
			case 6:
				// relatorio tributo
				break;
			case 7:
				// relatorio rendimento
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}
		}

	}

	public static Usuario verificaUsuario(Map<String, Cliente> mapaCliente, Map<String, Funcionario> mapaFuncionario,
			String cpf, String senha) {

		Usuario usuarioLogado = null;

		if (mapaFuncionario.get(cpf) != null) {
			String cargo = mapaFuncionario.get(cpf).getCargo();

			if (cargo.endsWith("Presidente")) {
				usuarioLogado = (Presidente) mapaFuncionario.get(cpf);
				if (logar(usuarioLogado, senha)) {
					Telas.telaPrincipal();
				} else {
					System.out.println("Dados incorretos!");
				}
				return usuarioLogado;
			} else if (cargo.endsWith("Diretor")) {
				usuarioLogado = (Diretor) mapaFuncionario.get(cpf);

				if (logar(usuarioLogado, senha)) {
					Telas.telaPrincipal();
				} else {
					System.out.println("Dados incorretos!");
				}
				return usuarioLogado;
			} else {
				usuarioLogado = (Gerente) mapaFuncionario.get(cpf);

				if (logar(usuarioLogado, senha)) {
					Telas.telaPrincipal();
				} else {
					System.out.println("Dados incorretos!");
				}
				return usuarioLogado;
			}
		} else if (mapaCliente.get(cpf) != null) {
			usuarioLogado = (Cliente) mapaCliente.get(cpf);
			if (logar(usuarioLogado, senha)) {
				Telas.telaPrincipal();
			} else {
				System.out.println("Dados incorretos!");
			}
			return usuarioLogado;

		} else {
			System.out.println("Não Cadastrado!");
		}

		return usuarioLogado;

	}

	public static boolean logar(Usuario usuario, String senha) {

		if (usuario.getSenha().endsWith(senha)) {
			return true;
		}
		return false;
	}

	public static Conta buscaConta(Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca, Usuario usuarioLogado) {
		
		Conta contaLogada = null;
		
		if(mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			return contaLogada;
		}
		
		if(mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			return contaLogada;
		}
		
		return contaLogada;
		
	}

}
