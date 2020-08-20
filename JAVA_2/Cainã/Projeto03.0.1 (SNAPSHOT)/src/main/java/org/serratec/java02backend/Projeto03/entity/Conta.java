package org.serratec.java02backend.Projeto03.entity;

public class Conta {
	
	private int id;
	private String titular;
	private double saldo;
	
	public Conta(int id, String titular, double saldo) {
		super();
		this.id = id;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
