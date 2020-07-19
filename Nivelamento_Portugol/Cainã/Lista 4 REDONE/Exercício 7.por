programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], i, maxima, minima

		para(i = 0; i < 5; i++)
		{
			escreva("Elemento - ", i, " : ")
			leia(vetor[i])
		}

		maxima = vetor[0]
		minima = vetor[0]

		para (i = 0; i < 5; i++)
		{
			se (vetor[i] > maxima)
			{
				maxima = vetor[i]
			}
		}
		
		para (i = 0; i < 5; i++)
		{
			se (vetor[i] < minima)
			{
				minima = vetor[i]
			}
		}
		escreva(maxima, "\n")
		escreva(minima, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */