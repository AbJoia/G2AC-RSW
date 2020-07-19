programa
{
	
	funcao inicio()
	{
		const inteiro tamanho = 5
		inteiro media = 0
		inteiro vetor[tamanho]
		
		para (inteiro i = 0; i < tamanho; i++)
		{
			leia(vetor[i])
		}

		limpa()

		para (inteiro j = 0; j < tamanho; j++)
		{
			media = media + vetor[j]
		}

		inteiro mediaTotal = media / tamanho

		escreva("A média é: ", mediaTotal, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {media, 7, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */