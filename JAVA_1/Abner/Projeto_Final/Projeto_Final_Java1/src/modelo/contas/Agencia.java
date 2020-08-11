package modelo.contas;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private int id;	
	private Gerente gerente;
	private ArrayList <Conta> contas = new ArrayList<Conta>();
	
	public Agencia(int id, Gerente gerente) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void relatorioContasNaAgencia(List lista) {		
		int contador = 0;
		for(int i = 0; i < lista.size(); i++) {
			if(this.id == lista.get(i)) {
				contador += 1;
			}
		}
		System.out.println("A agência a qual esse gerente é responsável possui " + contador + " contas.");
	}	
}
