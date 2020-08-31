package modelo.contas;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList <Agencia> agencias = new ArrayList<Agencia>();	
	
	public void adicionaAgencia(Agencia agencia) {
		agencias.add(agencia);
	}
	
	public Agencia getAgencia(int index) {
		return agencias.get(index);
	}

	public void relatorioClienteDasAgencia() {

	}
	
	public void relatorioTotalCapital() {
		
	}	

}
