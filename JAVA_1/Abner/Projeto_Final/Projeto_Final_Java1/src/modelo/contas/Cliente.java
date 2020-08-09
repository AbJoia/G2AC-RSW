package modelo.contas;

public class Cliente {

	private String nome;
	private String cpf;
	private String senha;
	private SeguroDeVida seguro;	
	private static final int tamanhoCPF = 11;

	public Cliente(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	protected boolean verificaSeguro() {
		if(this.seguro != null) {
			return true;
		}
		
		return false;
	}
	
	public String buscaInformacaoDeSeguro() {
		if(verificaSeguro()) {
			return "" + getSeguro().getImprimeSegurodeVida();
		}
		return "";
	}
	
	protected double buscaValorTaxadoSeguro() {
		if(verificaSeguro()) {
			return this.getSeguro().getValorTaxado();
		}
		return 0.0;
	}	
	
	public SeguroDeVida getSeguro() {
		return seguro;
	}
	
	public void contrataSeguro(SeguroDeVida contrato) {
		this.seguro = contrato;
	}	

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}	

	public String formatCpf() {
		if (this.cpf != null) {
			if (cpf.length() == tamanhoCPF) {
				return cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1\\.$2\\.$3-$4");
			}
		}
		return ("Cpf inválido.");
	}
}
