programa
{
	
	funcao inicio()
	{
		inteiro horas1, horas2, salario
		
		escreva("Digite o número de horas trabalhadas no ano : ")
		leia(horas1)
		escreva("Digite o número de horas extras trabalhadas no ano : ")
		leia(horas2)
		limpa()

		salario = (horas1 * 10) + (horas2 * 15)
		escreva("Seu salário anual é de : $ ", salario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */