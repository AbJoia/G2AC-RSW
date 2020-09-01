package modelo.contas;

import contas.Agencia;
import modelo.usuario.Cliente;

public class ContaPoupanca extends Conta {

	private final double TAXA_RENDIMENTO = 0.002;
	private final String TIPO_CONTA = "Conta Poupanca";

	public ContaPoupanca(Cliente titular, Agencia idAgencia, double saldo) {
		super(titular, idAgencia, saldo);		
	}

	@Override
	public void saque(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor;
		}

	}

	@Override
	public void deposito(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido");
		} else {
			this.saldo += valor;

		}
	}

	@Override
	public void transferePara(Conta destino, double valor) {
		if (this.saldo < valor) {
			System.out.println(
					"Não realizada! O valor a ser transferido mais o valor da taxa deve ser maior que o saldo atual");

		} else {
			this.saldo -= valor;
			destino.saldo = valor; // Verificar
		}

	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	public String simulaRendimento(double valor, int dia) {
		double total = valor * dia * TAXA_RENDIMENTO;
		String simulador = "Simulação de rendimento de R$ " + valor + " para " + dia + " dias com " + TAXA_RENDIMENTO
				+ "% de rendimento foi de: R$" + total;
		return simulador;
	}
	
	@Override
	public String relatorioTributo() {
		String extrato = "-----------------------------------------"
				+ "\n| Banco G2AC				|" 
				+ "\n| Agência: " + this.idAgencia.getNumeroAgencia() + "				|"
				+ "\n| Titular: " + this.titular.getNome() + "				|"
				+ "\n| CPF: " + this.titular.formatCpf() + "			|"
				+ "\n|---------Tributos Cobrados-------------|"
				+ titular.buscaInformacaoDeSeguro() 
				+ "\n| Total Gasto c/ Tributos: " + String.format("%.2f", this.titular.buscaValorTaxadoSeguro()) + "	|"
				+ "\n-----------------------------------------";
		return extrato;
	}

}
