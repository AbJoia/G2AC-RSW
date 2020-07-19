programa
{
	
	funcao inicio()
	{
		inteiro num, espaco

		leia(num)
		espaco = num - 1

		para(inteiro c1 = 1; c1 <= num; c1++)
		{
			para(inteiro s = espaco; s >= 0; s--)
			{
				escreva(" ")
			}
			para(inteiro c2 = 1; c2 <= c1; c2++)
			{
				escreva("* ")
			}
			escreva("\n")
			espaco--
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 6, 10, 3}-{espaco, 6, 15, 6}-{c1, 11, 15, 2}-{c2, 17, 16, 2}-{s, 13, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */