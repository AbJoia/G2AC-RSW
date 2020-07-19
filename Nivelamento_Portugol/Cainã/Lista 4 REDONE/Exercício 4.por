programa
{
	inteiro num2 = 50
	funcao inicio()
	{
		inteiro num1 = 1
		escreva(contaNatural(num1))
	}

	funcao inteiro contaNatural (inteiro num1)
	{
		se (num1 == num2)
		{
			retorne num1
		}
		senao
		{
			escreva(num1, " ")
			retorne contaNatural (num1 + 1)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 162; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */