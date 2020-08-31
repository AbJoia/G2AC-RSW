package modelo.contas;

public class SeguroDeVida {
	
	private Cliente titular;
	private double valor;
	
	public SeguroDeVida(Cliente titular, double valor) {
		this.titular = titular;
		this.valor = valor;
		this.titular.contratoSeguroVida();	
		
	}
	
	public double getValorSegurado() {
		if(titular.contratoSeguroVida() == true) {
			double resultado = (valor * 20) / 100;
			return resultado;
		}
		
		return 0.0;
	}
	
	

}
