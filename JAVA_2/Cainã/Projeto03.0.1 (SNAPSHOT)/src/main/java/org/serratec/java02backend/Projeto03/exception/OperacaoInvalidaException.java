package org.serratec.java02backend.Projeto03.exception;

public class OperacaoInvalidaException extends Exception {
	
	private String op;

	public OperacaoInvalidaException(String op) {
		this.op = op;
	}

	public String getOp() {
		return op;
	}
}
