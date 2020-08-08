package modelo.contas;

public class MainTeste {
	
	public static void main(String[] args) {
		
		Agencia a1 = new Agencia(1);		
		//Cliente c1 = new Cliente("João", "13128255566", "1234");
		Cliente c2 = new Cliente("Ana", "13128255500", "4321");
		//Cliente c3 = new Cliente("Maria", "13128255501", "2323");
		//ContaPoupanca cp1 = new ContaPoupanca(c1, a1, 0, "Conta Poupança");
		ContaCorrente cp2 = new ContaCorrente(c2, a1, 50.00, "Conta Poupança");
		//ContaCorrente cc2 = new ContaCorrente(c3, a1, 1000.00, "Conta Corrente");
		
		System.out.println(c2.getSegurodeVida());
		
		SeguroDeVida sv = new SeguroDeVida(c2, 100);
		
		System.out.println(c2.getSegurodeVida());
		System.out.println(cp2.relatorioTributo());
		
		
		
		
		
		
		
		//System.out.println(cp2.simulaRendimento(100, 90));
		/*cc2.transferePara(cp2, 50.00);		
		
		System.out.println(cp2.getSaldo());
		System.out.println(cc2.relatorioTributo());
		System.out.println(cc2.getSaldo());*/
		
	}
}
