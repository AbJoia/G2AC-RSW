programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz1[2][2], matriz2[2][2]
		para(inteiro i = 0; i < 2; i++)
		{
			para(inteiro j = 0; j < 2; j++)
			{
				matriz1[i][j] = Util.sorteia(1, 9)
				matriz2[i][j] = Util.sorteia(1, 9)
			}
		}
		calcula(matriz1, matriz2)
	}

	funcao calcula(inteiro matriz1[][], inteiro matriz2[][])
	{
		inteiro matriz3[2][2]
		para(inteiro i = 0; i < 2; i++)
		{
			para(inteiro j = 0; j < 2; j++)
			{
				para(inteiro x = 0; x < 2; x++)
				{
					matriz3[i][j] += matriz1[i][x] * matriz2[x][j]
				}
				escreva(matriz3[i][j], " ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 19, 24, 7}-{matriz2, 19, 45, 7}-{matriz3, 21, 10, 7}-{i, 22, 15, 1}-{j, 24, 16, 1}-{x, 26, 17, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */