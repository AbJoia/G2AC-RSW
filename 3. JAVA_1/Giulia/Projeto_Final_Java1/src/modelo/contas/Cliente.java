package modelo.contas;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String senha;
	private boolean seguroVida = false;
	private static final int tamanhoCPF = 11; 
	
	
	public Cliente(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public boolean getSegurodeVida() {
		return this.seguroVida;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public boolean contratoSeguroVida() {
		this.seguroVida = true;
		return this.seguroVida;
	}
	
	public String formatCpf() {  
        if (this.cpf != null) {      
            if (cpf.length() == tamanhoCPF) {  
                return cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})","$1\\.$2\\.$3-$4");  
            }  
        }  
        return ("Cpf inválido.");  
    }  
}
