programa
{
	
	funcao inicio()
	{
		real valor[2]
		cadeia resp

		para (inteiro i = 0; i < 2; i++)
		{
			escreva("Digite um número: ")
			leia(valor[i])
		}
		limpa()
		
		escreva("A soma de ", valor[0], " com ", valor[1], " é igual a ", soma(valor), "\n")
		escreva("A subtração de ", valor[0], " por ", valor[1], " é igual a ", sub(valor), "\n")
		escreva("A divisão de ", valor[0], " por ", valor[1], " é igual a ", divisao(valor), "\n")
		escreva("A multiplicação de ", valor[0], " por ", valor[1], " é igual a ", multi(valor), "\n")

		escreva("\nGostaria de realizar outra conta? (s ou n)\n")
		leia(resp)
		limpa()

		se (resp != "s" e resp != "n")
		{
			escreva("ERRO!!! Por favor, tente novamente\n\n")
			inicio()
		}

		se (verificaSN(resp) == verdadeiro)
		{
			inicio()
		}

		senao se (verificaSN(resp) == falso)
		{
			escreva("Programa finalizado\n")
		}
	}

	funcao real soma (real valor[])
	{
		retorne valor[0] + valor[1]
	}

	funcao real sub (real valor[])
	{
		retorne valor[0] - valor[1]
	}

	funcao real divisao (real valor[])
	{
		retorne valor[0] / valor[1]
	}

	funcao real multi (real valor[])
	{
		retorne valor[0] * valor[1]
	}

	funcao logico verificaSN (cadeia resp)
	{
		se (resp == "s")
		{
			retorne verdadeiro
		}

		senao
		{
			retorne falso
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @DOBRAMENTO-CODIGO = [24, 30, 35, 41, 46, 51, 56, 61];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 6, 7, 5}-{resp, 7, 9, 4}-{resp, 62, 34, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */