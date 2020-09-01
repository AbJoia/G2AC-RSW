programa
{
	
	funcao inicio()
	{
		//const inteiro tamanho = 10
		inteiro vetor[10]

		escreva("Digite os números que deseja guardar no vetor: \n")
		
		para (inteiro i = 0; i < 10; i++)
		{
			leia(vetor[i])
		}

		limpa()

		para (inteiro j = 9; j >= 0; j--)
		{
			escreva(vetor[j], " ")
		}

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 7, 10, 5}-{i, 11, 16, 1}-{j, 18, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */