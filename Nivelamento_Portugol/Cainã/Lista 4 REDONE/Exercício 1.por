programa
{
	
	funcao inicio()
	{

//variáveis

		real num1, num2
		real media1 = 0.0
		real media2 = 0.0

//entrada de dados

		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		limpa()

//resolução do problema e saída de dados

		m(num1, num2, media1, media2)
	}

//funções

	funcao m (real num1, real num2, real media1, real media2)
	{
		media1 = num1 + num2
		media2 = media1 / 2
		escreva("A média é: ", media2, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */