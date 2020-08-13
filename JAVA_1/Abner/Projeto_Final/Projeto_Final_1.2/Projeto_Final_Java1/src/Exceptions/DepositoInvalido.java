package Exceptions;

public class DepositoInvalido extends Exception {

	public DepositoInvalido(double valor) {
		super("Valor inv�lido para dep�sito!" + valor);
	}	
}
