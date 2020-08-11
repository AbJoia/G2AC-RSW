package modelo.contas;

public class TesteLista {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Gerente g1 = new Gerente("Roberto", "12365465465", "555", "Gerente");
		Agencia ag1 = new Agencia(111, g1);		
		
		banco.adicionaAgencia(ag1);
		Cliente cliente1 = new Cliente("Alex", "12345678965", "123");
		ContaCorrente cc1 = new ContaCorrente(cliente1, ag1, 100, "Conta Corrente");
		cliente1.contrataSeguro(new SeguroDeVida(500));		
		
		System.out.println(cc1.relatorioTributo());
		
		
		
		
	}

}
