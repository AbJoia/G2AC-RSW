package modelo.contas;

public class SeguroDeVida {
	
	private double TRIBUTO_SEGURO = 0.2;	
	private double valorSegurado;
	private double valorTaxado;
	
	public SeguroDeVida(double valor) {
		if(valor > 0) {				
			this.valorSegurado = debitaTaxa(valor);
			this.valorTaxado = valorTaxado(valor);			
			
		}else {
			System.out.println("Não é possivel contratar seguro para o valor informado!"); //Exception ???
		}				
	}
	
	public double getValorSegurado() {
		return this.valorSegurado;
	}
	
	public double getValorTaxado() {
		return this.valorTaxado;
	}
	
	private double debitaTaxa(double valor) {
		return valor - (valor * TRIBUTO_SEGURO);
	}
	
	private double valorTaxado(double valor) {
		return valor * TRIBUTO_SEGURO;
	}
	
	public String getImprimeSegurodeVida() {		
		return "\n| Tributo Seguro De Vida: " + String.format("%.2f", this.valorTaxado) + "         |" + "\n| Valor segurado: "
				+ String.format("%.2f", this.valorSegurado) + "                 |";
	
}
}
