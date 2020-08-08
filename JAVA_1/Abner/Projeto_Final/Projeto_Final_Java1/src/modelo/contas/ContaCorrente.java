package modelo.contas;

public class ContaCorrente extends Conta {

	private final double TAXA_DEPOSITO = 0.10;
	private final double TAXA_SAQUE = 0.10;
	private final double TAXA_TRANSFERENCIA = 0.20;
	
	private SeguroDeVida sv;

	private String tipoConta;
	private double totalTributo;

	public ContaCorrente(Cliente titular, Agencia idAgencia, double saldo, String tipoConta) {
		super(titular, idAgencia, saldo);
		this.tipoConta = tipoConta;		
	}
	
	@Override
	protected double getSaldo() {
		return this.saldo;
	}

	@Override
	protected void saque(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor + TAXA_SAQUE;
			atualizaTributado(TAXA_SAQUE);
		}
	}

	@Override
	protected void deposito(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido");
		} else {
			this.saldo += valor - TAXA_DEPOSITO;
			atualizaTributado(TAXA_DEPOSITO);
		}

	}

	@Override
	protected void transferePara(Conta destino, double valor) {
		if (this.saldo < valor + TAXA_TRANSFERENCIA) {
			System.out.println(
					"Não realizada! O valor a ser transferido mais o valor da taxa deve ser maior que o saldo atual");

		} else {
			this.saldo -= valor + TAXA_TRANSFERENCIA;
			destino.saldo = valor; // Verificar
			atualizaTributado(TAXA_TRANSFERENCIA);
		}

	}	

	public void atualizaTributado(double tributo) {
		this.totalTributo += tributo;
	}

	public String relatorioTributo() {
		String extrato = "*******Banco G2AC********\n\n" + "Agência: " + this.idAgencia.getId() + "\nTitular: "
				+ this.titular.getNome() + "\nCPF: " + this.titular.getCpf() + "\n\nTributos Cobrados:\nTaxa Saque: "
				+ TAXA_SAQUE + "\nTaxa Deposito: " + TAXA_DEPOSITO + "\nTaxa Transferencia: " + TAXA_TRANSFERENCIA
				+ "\nTotal Tributos: " + this.totalTributo + " " + sv.getValorSegurado();
		return extrato;
	}

}
