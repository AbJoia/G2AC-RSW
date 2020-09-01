programa
{
	inclua biblioteca Util
	const inteiro tamanho = 20
	funcao inicio()
	{
		inteiro vetor[tamanho]
		
		para (inteiro i = 0; i < tamanho; i++)
		{
			vetor [i] = Util.sorteia(0, 2)
			escreva(vetor[i])
		}
		escreva("\n\n")
		bubbleSort(vetor)
		retornaDupla(vetor)
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
	
	funcao retornaDupla(inteiro vetor[])
	{
		inteiro repetido = vetor[0]
		para(inteiro i = 0; i < tamanho; i++)
		{
			para(inteiro j = i + 1; j < tamanho; j++)
			{
				se((vetor[i]) == (vetor[j]) e vetor[i] != repetido)
				{
					repetido = vetor[i]
					escreva("O número ", repetido, " se repetiu\n")	
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 184; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */