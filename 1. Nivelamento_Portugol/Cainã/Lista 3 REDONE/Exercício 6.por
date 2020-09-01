programa
{
	funcao inicio()
	{
		inteiro num1, num2
		caracter op
	
		escreva("Digite um número: ")
		leia(num1)
		escreva("Digite outro número: ")
		leia(num2)
		escreva("Digite a operação desejada (+ - * /): ")
		leia(op)

		se (op == '+')
		{
			soma(num1, num2)
		}
		senao se (op == '-')
		{
			sub(num1, num2)
		}
		senao se (op == '*')
		{
			multi(num1, num2)
		}
		senao se (op == '/')
		{
			divisao(num1, num2)
		}
		senao
		{
			escreva("ERRO!!! Por favor, reinicie o programa digite outra operação")
		}
	}

	funcao soma (inteiro num1, inteiro num2)
	{
		escreva(num1, " + ", num2, " = ", num1 + num2)
	}
	funcao sub (inteiro num1, inteiro num2)
	{
		escreva(num1, " - ", num2, " = ", num1 - num2)
	}
	funcao multi (inteiro num1, inteiro num2)
	{
		escreva(num1, " * ", num2, " = ", num1 * num2)
	}
	funcao divisao (inteiro num1, inteiro num2)
	{
		escreva(num1, " / ", num2, " = ", num1 / num2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */