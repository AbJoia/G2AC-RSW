package modelo.contas;

public class MainTeste {
	
	public static void main(String[] args) {
		
		Agencia agencia = new Agencia(123);		
		Cliente cliente1 = new Cliente("João", "13128255566", "1234");
		Cliente cliente2 = new Cliente("Ana", "13128255500", "4321");		
		ContaPoupanca cp1 = new ContaPoupanca(cliente2, agencia, 60, "Conta Poupança");
		ContaCorrente cc2 = new ContaCorrente(cliente1, agencia, 50.00, "Conta Corrente");	
		
		cliente1.contrataSeguro(new SeguroDeVida(100));
		
		cc2.deposito(40);
		cc2.transferePara(cp1, 20);
		cc2.saque(30);
		System.out.println(cc2.relatorioTributo());	
	}
}
