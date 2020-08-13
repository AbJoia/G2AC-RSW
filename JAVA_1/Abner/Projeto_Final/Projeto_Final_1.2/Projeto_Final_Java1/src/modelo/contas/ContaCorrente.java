package modelo.contas;

import contas.Agencia;
import modelo.usuario.*;

public class ContaCorrente extends Conta {

	private final double TAXA_DEPOSITO = 0.10;
	private final double TAXA_SAQUE = 0.10;
	private final double TAXA_TRANSFERENCIA = 0.20;	

	private final String TIPO_CONTA = "Conta Corrente";
	
	private int totalDeposito = 0;
	private int totalSaque = 0;	
	private int totalTransferencia = 0;

	public ContaCorrente(Cliente titular, Agencia idAgencia, double saldo) {
		super(titular, idAgencia, saldo);			
	}	
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void saque(double valor) {		
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor + TAXA_SAQUE;			
			this.totalSaque++;
		}
	}

	@Override
	public void deposito(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido");
		} else {
			this.saldo += valor - TAXA_DEPOSITO;			
			this.totalDeposito++;
		}
	}

	@Override
	public void transferePara(Conta destino, double valor) {
		if (this.saldo < valor + TAXA_TRANSFERENCIA) {
			System.out.println(
					"Não realizada! O valor a ser transferido mais o valor da taxa deve ser maior que o saldo atual");

		} else {
			this.saldo -= valor + TAXA_TRANSFERENCIA;
			destino.saldo = valor;							// Exception aqui!			
			this.totalTransferencia++;
		}

	}
	
	public double totalTributo() {
		return (TAXA_DEPOSITO * this.totalDeposito) + (TAXA_SAQUE * this.totalSaque) + (TAXA_TRANSFERENCIA * this.totalTransferencia);
	}
	
	@Override
	public String relatorioTributo() {
		String extrato = "-----------------------------------------"
				+ "\n| Banco G2AC				|" 
				+ "\n| Agência: " + this.idAgencia.getNumeroAgencia() + "				|"
				+ "\n| Titular: " + this.titular.getNome() + "				|"
				+ "\n| CPF: " + this.titular.formatCpf() + "			|"
				+ "\n|---------Tributos Cobrados-------------|"
				+ "\n| Taxa Saque: " + String.format("%.2f", TAXA_SAQUE) + "			|"
				+ "\n| Total de Operações: " + this.totalSaque + "                 |\n| Total Gasto: " + String.format("%.2f", TAXA_SAQUE * this.totalSaque) + "			|"
				+ "\n| Taxa Deposito: " + String.format("%.2f",TAXA_DEPOSITO) + "			|"
				+ "\n| Total de Operações: " + this.totalDeposito + "                 |\n| Total Gasto: " + String.format("%.2f", TAXA_DEPOSITO * this.totalDeposito) + "			|"
				+ "\n| Taxa Transferencia: " + String.format("%.2f",TAXA_TRANSFERENCIA)+ "		|"
				+ "\n| Total de Operações: " + this.totalTransferencia + "                 |\n| Total Gasto: " + String.format("%.2f", TAXA_TRANSFERENCIA * this.totalTransferencia) + "			|"
				+ this.titular.buscaInformacaoDeSeguro()
				+ "\n| Total Gasto c/ Tributos: " + String.format("%.2f",this.totalTributo() + this.titular.buscaValorTaxadoSeguro()) + "	|"
				+ "\n-----------------------------------------";
		return extrato;
	}

	@Override
	public String toString() {
		return "ContaCorrente [totalDeposito=" + totalDeposito + ", totalSaque=" + totalSaque + ", totalTransferencia="
				+ totalTransferencia + ", titular=" + titular + ", idAgencia=" + idAgencia + ", saldo=" + saldo + "]";
	}
	
	

}
