package main;

import contas.Agencia;
import contas.SeguroDeVida;
import modelo.contas.ContaCorrente;
import modelo.usuario.Cliente;
import modelo.usuario.Gerente;

public class TesteLista {

	public static void main(String[] args) {
		
		Agencia ag1 = new Agencia(111);
		Gerente g1 = new Gerente("Roberto", "12365465465", "555", ag1);
		
		g1.relatorioContasNaAgencia(contaCorrente);
		
		Cliente cliente1 = new Cliente("Alex", "12345678965", "123");
		ContaCorrente cc1 = new ContaCorrente(cliente1, ag1, 100);
		cliente1.contrataSeguro(new SeguroDeVida(500));		
		
		System.out.println();		
		
	}

}
