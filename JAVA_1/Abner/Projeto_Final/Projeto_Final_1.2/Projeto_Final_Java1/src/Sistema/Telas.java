package Sistema;

import java.util.Scanner;

public class Telas {
	
	
	
	public static void telaLogin() {
		System.out.println("Bem vindo ao Banco G2AC!");
		System.out.println("Digite seu CPF e Senha para Logar");
	}
	
	public static void telaPrincipal() {
		
		System.out.println("\n Operações");
		System.out.println(" | 1 - Saque |");
		System.out.println(" | 2 - Deposito |");
		System.out.println(" | 3 - Tranferencia |");
		System.out.println(" | 4 - Contratação Seguro de Vida |");
		System.out.println("\n Relatorios");		
		System.out.println(" | 5 - Saldo |");
		System.out.println(" | 6 - Relatorio Tributação Conta Corrente |");
		System.out.println(" | 7 - Relatorio Rendimento Conta Poupanca |");
		
	}
	
	public static void telaSaque() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Saque");
		System.out.println("\n Digite o Valor do saque");
		double valor = sc.nextDouble();
		
	}

}








/*System.out .println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
System.out.println("\n =========================");
System.out.println(" | 1 - Venda |");
System.out.println(" | 2 - Vendedor |");
System.out.println(" | 3 - Compra |");
System.out.println(" | 4 - Produto |");
System.out.println(" | 5 - Cliente |");
System.out.println(" | 6 - Fornecedor |");
System.out.println(" | 0 - Sair |");
System.out.println(" =========================\n");
opcao = Console.readInt("Opção -> "); 
System.out.print("\n");

switch (opcao) {
case 1: 
	break;
case 2: fornecedor();
break;
case 3 , 4, 5: cliente();
break; 
case 0:
	break; 
default: System.out.println("Opção Inválida!"); 
break;
}
}
while(opcao!=0)*/
