programa
{
	
	funcao inicio()
	{
		inteiro num, n, resto = 0
		inteiro numInv = 0

		leia(num)

		para (n = num; num > 0; num = num / 10)
		{
			resto = num % 10
			numInv = (numInv + resto) * 10
		}
		numInv = numInv / 10
		se (numInv == n)
		{
			escreva(n, " é um número palíndromo")
		}
		senao
		{
			escreva(n, " não é um número palíndromo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 6, 10, 3}-{n, 6, 15, 1}-{resto, 6, 18, 5}-{numInv, 7, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */