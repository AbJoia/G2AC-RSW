programa
{
	inteiro n
	inteiro num
	funcao inicio()
	{
		n = 0
		leia(num)
		se (num == 0)
		{
			escreva(1)
		}
		senao
		{
			escreva("O número de dígitos do número é: ", verificaDigito())	
		}	
	}

	funcao inteiro verificaDigito ()
	{
		se (num == 0)
		{
			retorne n
		}
		senao
		{
			num = num / 10
			n = n + 1
			retorne verificaDigito()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n, 3, 9, 1}-{num, 4, 9, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */