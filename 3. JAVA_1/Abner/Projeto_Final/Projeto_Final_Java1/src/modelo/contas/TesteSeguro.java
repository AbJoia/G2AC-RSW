package modelo.contas;

public class TesteSeguro {

	public static void main(String[] args) {
		
		Agencia ag = new Agencia(123);
		Cliente c1 = new Cliente("alex", "11122233365", "223");
		Cliente c2 = new Cliente("Joao", "11122233366", "224");
		ContaCorrente cc1 = new ContaCorrente(c1, ag, 0, "C/C");
		ContaPoupanca cp1 = new ContaPoupanca(c2, ag, 0, "C/P");
		
		c1.contrataSeguro(new SeguroDeVida(100));
		//System.out.println(c2.verificaSeguro());
		cc1.deposito(40);
		//cc1.transferePara(cp1, 20);
		cc1.saque(30);
		System.out.println(cc1.relatorioTributo());		

	}
}
