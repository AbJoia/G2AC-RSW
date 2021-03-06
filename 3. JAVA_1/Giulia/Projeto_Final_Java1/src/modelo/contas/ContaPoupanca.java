package modelo.contas;

public class ContaPoupanca extends Conta {

	private final double TAXA_RENDIMENTO = 0.002;
	private String tipoConta;

	public ContaPoupanca(Cliente titular, Agencia idAgencia, double saldo, String tipoConta) {
		super(titular, idAgencia, saldo);
		this.tipoConta = tipoConta;
	}

	@Override
	protected void saque(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor;
		}

	}

	@Override
	protected void deposito(double valor) {
		if (valor < 0) {
			System.out.println("Valor inv�lido");
		} else {
			this.saldo += valor;

		}
	}

	@Override
	protected void transferePara(Conta destino, double valor) {
		if (this.saldo < valor) {
			System.out.println(
					"N�o realizada! O valor a ser transferido mais o valor da taxa deve ser maior que o saldo atual");

		} else {
			this.saldo -= valor;
			destino.saldo = valor; // Verificar
		}

	}

	@Override
	protected double getSaldo() {
		return this.saldo;
	}

	public String simulaRendimento(double valor, int dia) {
		double total = valor * dia * TAXA_RENDIMENTO;
		String simulador = "Simula��o de rendimento de R$ " + valor + " para " + dia + " dias com " + TAXA_RENDIMENTO
				+ "% de rendimento foi de: R$" + total;
		return simulador;
	}

}
