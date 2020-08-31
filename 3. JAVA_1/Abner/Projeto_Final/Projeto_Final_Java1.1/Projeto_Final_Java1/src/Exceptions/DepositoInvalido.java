package Exceptions;

public class DepositoInvalido extends Exception {

	public DepositoInvalido(double valor) {
		super("Valor inválido para depósito!" + valor);
	}	
}
