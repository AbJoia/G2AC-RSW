package modelo.contas;

public abstract class Conta {
	
	protected Cliente titular;
	protected Agencia idAgencia;
	protected double saldo;
	
	public Conta(Cliente titular, Agencia idAgencia, double saldo) {
		this.titular = titular;
		this.idAgencia = idAgencia;
		this.saldo = saldo;
	}
	
	protected abstract void saque(double valor);
	protected abstract void deposito(double valor);
	protected abstract void transferePara(Conta destino, double valor);
	protected abstract double getSaldo();
}
