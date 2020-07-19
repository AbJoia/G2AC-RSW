programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro tamanho = 10
		inteiro vetor[tamanho]

		para (inteiro i = 0; i < tamanho; i++)
		{
			vetor[i] = Util.sorteia(0, 100)
		}

		calcMedia (vetor, tamanho, verificaMaior(vetor, tamanho), verificaMenor(vetor, tamanho))
	}

	funcao inteiro verificaMaior(inteiro vetor[], inteiro tamanho)
	{
		inteiro maior = vetor[0]
		para (inteiro i = 0; i < tamanho; i++)
		{
			se (vetor[i] > maior)
			{
				maior = vetor[i]
			}
		}
		retorne maior
	}

	funcao inteiro verificaMenor(inteiro vetor[], inteiro tamanho)
	{
		inteiro menor = vetor[0]
		para (inteiro i = 0; i < tamanho; i++)
		{
			se (vetor[i] < menor)
			{
				menor = vetor[i]
			}
		}
		retorne menor
	}

	funcao calcMedia (inteiro vetor[], inteiro tamanho, inteiro maior, inteiro menor)
	{
		inteiro resultado = 0
		para (inteiro i = 0; i < tamanho; i++)
		{
			se (vetor[i] != maior e vetor[i] != menor)
			{
				resultado = resultado + vetor[i]
			}
		}
		escreva(resultado / (tamanho - 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */