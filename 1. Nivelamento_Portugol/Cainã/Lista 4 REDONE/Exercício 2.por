programa
{
		funcao inicio()
	{
		inteiro ano

//entrada de dados

		leia(ano)

//resolução do problema e saída de dados

		verificaBissexto (ano)
	}
//funções

	funcao verificaBissexto (inteiro ano)
	{
		se ((ano % 400 == 0) ou (ano % 4 == 0) e (ano % 100 != 0))
		{
			escreva("O ano é bissexto")
		}
		senao
		{
			escreva("O ano não é bissexto")
		}
	}
}














/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */