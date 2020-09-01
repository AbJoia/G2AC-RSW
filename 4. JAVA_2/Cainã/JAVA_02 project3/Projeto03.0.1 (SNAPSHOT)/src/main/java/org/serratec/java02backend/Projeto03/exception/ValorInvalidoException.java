package org.serratec.java02backend.Projeto03.exception;

public class ValorInvalidoException extends Exception{
	
	private double valor;
	
	public ValorInvalidoException(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
