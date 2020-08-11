package main.teste;

import modelo.usuario.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteLogin {

	public static void main(String[] args) throws IOException {		
		
		Map<String, Cliente> mapaCliente = new HashMap<>();
		Cliente c1;
		
		String arquivo = "C:\\Users\\abner\\eclipse-workspace\\Projeto_Final_Java1\\src\\BaseDadosCSV\\tabela_cliente.csv";
		BufferedReader ler = new BufferedReader(new FileReader(arquivo));
		String linha;
		linha = ler.readLine();
		while((linha = ler.readLine()) != null) {
			String [] dado = linha.split(";");
			c1 = new Cliente(dado[0], dado[1], dado[2]);
			mapaCliente.put(c1.getCpf(), c1);
		}		
		ler.close();
		
		/*for(int i = 0; i < mapaCliente.size(); i++) {
			System.out.println(mapaCliente.get(get));
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String cpf = "43627581324";
		String senha = sc.next();
		
		Cliente c2 = mapaCliente.get(cpf);
		
		System.out.println(c2.getSenha());
		
		if(c2.getSenha() == senha) {
			System.out.println("Senha Correta!");
		}
		else {
			System.out.println();
		}
		
		/*if(c2 != null) {			
			if(sc.next() == c2.getSenha()) {				
				System.out.println("Login Realizado!");
			}else {
				System.out.println("Dados incorretos!");
			}
			System.out.println("Existe");
		}
		else {
			System.out.println("Não Existe");
		}*/
		
		
		
		
		

	}

}
