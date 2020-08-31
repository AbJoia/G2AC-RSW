programa
{
	inclua biblioteca Util
	const inteiro tamanho = 20
	funcao inicio()
	{
		inteiro vetor[tamanho]
		para(inteiro i = 0; i < tamanho; i++)
		{
			vetor[i] = Util.sorteia(0, 100)
		}
		escreva("Vetor original: ")
		imprimeVetor(vetor)

		bubbleSort(vetor)

		escreva("\nVetor ordenado: ")
		imprimeVetor(vetor)
	}

	funcao bubbleSort(inteiro vetor[])
	{
		para(inteiro i = 0; i < tamanho - 1; i++)
		{
			para(inteiro j = 0; j < tamanho - i - 1; j++)
			{
				se (vetor[j] > vetor[j + 1])
				{
					inteiro aux = vetor[j]
					vetor[j] = vetor[j + 1]
					vetor[j + 1] = aux
				}
			}
		}
	}

	funcao imprimeVetor(inteiro vetor[])
	{
		para(inteiro i = 0; i < tamanho; i++)
		{
			escreva(vetor[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */