package Sistema;

import java.util.Map;
import java.util.Scanner;

import contas.SeguroDeVida;
import modelo.contas.Conta;
import modelo.contas.ContaCorrente;
import modelo.contas.ContaPoupanca;
import modelo.usuario.Cliente;
import modelo.usuario.Usuario;

public class Telas {

	public static void telaLogin() {
		System.out.println("Bem vindo ao Banco G2AC!");
		System.out.println("Digite seu CPF e Senha para Logar");
	}

	public static void telaPrincipal() {

		System.out.println("\n Operações");
		System.out.println(" | 1 - Saque |");
		System.out.println(" | 2 - Deposito |");
		System.out.println(" | 3 - Tranferencia |");
		System.out.println(" | 4 - Contratação Seguro de Vida |");
		System.out.println("\n Relatorios");
		System.out.println(" | 5 - Saldo |");
		System.out.println(" | 6 - Relatorio Tributação |");
		System.out.println(" | 7 - Relatorio Rendimento Conta Poupanca |");
		System.out.println(" | 0 - Finalizar |");

	}

	public static void telaSaque(Usuario usuarioLogado, Conta contaLogada, Map<String, ContaCorrente> mapaContaCorrente,
			Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Saque");
		System.out.println("\n Digite o valor do saque: ");
		double valor = sc.nextDouble();

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			cc.saque(valor);

		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			cp.saque(valor);
		}

	}

	public static void telaDeposito(Usuario usuarioLogado, Conta contaLogada,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Depósito");
		System.out.println("\n Digite o valor do deposito: ");
		double valor = sc.nextDouble();

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			cc.deposito(valor);

		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			cp.deposito(valor);
		}

	}

	public static void telaTransferencia(Usuario usuarioLogado, Conta contaLogada,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Transferência");
		System.out.println("\n Digite o valor da transferência: ");
		double valor = sc.nextDouble();
		System.out.println("Digite o cpf do destinatário: ");
		String cpfDestinatario = sc.next();
		Conta contaDestino;

		if (mapaContaCorrente.get(cpfDestinatario) != null) {
			contaDestino = mapaContaCorrente.get(cpfDestinatario);

			if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
				ContaCorrente cc = (ContaCorrente) contaLogada;
				cc.transferePara(contaDestino, valor);

			}

			else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
				ContaPoupanca cp = (ContaPoupanca) contaLogada;
				cp.transferePara(contaDestino, valor);
			}

		}

		else if (mapaContaPoupanca.get(cpfDestinatario) != null) {
			contaDestino = mapaContaPoupanca.get(cpfDestinatario);

			if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
				ContaCorrente cc = (ContaCorrente) contaLogada;
				cc.transferePara(contaDestino, valor);
			}

			else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
				ContaPoupanca cp = (ContaPoupanca) contaLogada;
				cp.transferePara(contaDestino, valor);
			}

		}

		else {
			System.out.println("Conta não encontrada!");
		}
	}

	public static void telaSeguro(Usuario usuarioLogado, Map<String, Cliente> mapaCliente) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor a ser segurado: ");
		double valorSegurado = sc.nextDouble();

		if (mapaCliente.get(usuarioLogado.getCpf()) != null) {
			usuarioLogado = (Cliente) mapaCliente.get(usuarioLogado.getCpf());
			Cliente c = (Cliente) usuarioLogado;
			c.contrataSeguro(new SeguroDeVida(valorSegurado));
			System.out.println("Seguro contratado com sucesso!!!");
		} else {
			System.out.println("Não é possível concluir a operação.");
		}
	}

	public static void telaSaldo(Usuario usuarioLogado, Conta contaLogada, Map<String, ContaCorrente> mapaContaCorrente,
			Map<String, ContaPoupanca> mapaContaPoupanca) {

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			System.out.println("Saldo atual da conta: R$" + String.format("%.2f", cc.getSaldo()));
		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			System.out.println("Saldo atual da conta: R$" + String.format("%.2f", cp.getSaldo()));
		}
	}

	public static void telaRelatorioTributo(Usuario usuarioLogado, Conta contaLogada,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			System.out.println(cc.relatorioTributo());
		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			System.out.println(cp.relatorioTributo());
		}
	}

	public static void telaRelatorioRendimento(Usuario usuarioLogado, Conta contaLogada,
			Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);
		
		if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			
			System.out.println("Digite o valor que deseja simular: ");
			double valor = sc.nextDouble();
			System.out.println("Digite o número de dias que deseja simular: ");
			int dia = sc.nextInt();
			
			cp.simulaRendimento(valor, dia);
		}
		else {
			System.out.println("Não é uma conta poupança. Não é possível realizar a ação");
		}
	}
}

/*
 * System.out
 * .println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###"
 * ); System.out.println("\n =========================");
 * System.out.println(" | 1 - Venda |");
 * System.out.println(" | 2 - Vendedor |");
 * System.out.println(" | 3 - Compra |");
 * System.out.println(" | 4 - Produto |");
 * System.out.println(" | 5 - Cliente |");
 * System.out.println(" | 6 - Fornecedor |");
 * System.out.println(" | 0 - Sair |");
 * System.out.println(" =========================\n"); opcao =
 * Console.readInt("Opção -> "); System.out.print("\n");
 * 
 * switch (opcao) { case 1: break; case 2: fornecedor(); break; case 3 , 4, 5:
 * cliente(); break; case 0: break; default:
 * System.out.println("Opção Inválida!"); break; } } while(opcao!=0)
 */
