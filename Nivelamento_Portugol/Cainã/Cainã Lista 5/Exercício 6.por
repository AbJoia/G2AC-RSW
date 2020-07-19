programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz[3][3]

		para (inteiro i = 0; i < 3; i++)
		{
			para (inteiro j = 0; j < 3; j++)
			{
				matriz[i][j] = Util.sorteia(0, 100)
			}
		}
		somaDiagonal(matriz)
	}

	funcao somaDiagonal (inteiro matriz[][])
	{
		inteiro soma = 0

		para (inteiro i = 0; i < 3; i++)
		{
			para (inteiro j = 0; j < 3; j++)
			{
				se (j == i)
				{
					soma = soma + matriz[i][j]
				}
			}
		}
		escreva("A soma da diagonal da matriz é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 7, 10, 6}-{soma, 21, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */