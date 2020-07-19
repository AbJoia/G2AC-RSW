programa
{
	
	funcao inicio()
	{
		real num1, num2
		caracter op

		leia(num1)
		leia(num2)
		leia(op)
		limpa()

		se (op == '+')
		{
			escreva(num1, " ", op, " ", num2, " = ", num1 + num2)
		}
		senao se (op == '-')
		{
			escreva(num1, " ", op, " ", num2, " = ", num1 - num2)
		}
		senao se (op == '/')
		{
			escreva(num1, " ", op, " ", num2, " = ", num1 / num2)
		}
		senao se (op == '*')
		{
			escreva(num1, " ", op, " ", num2, " = ", num1 * num2)
		}
		senao
		{
			escreva("ERRO!!!\n", "\nPor favor, reinicie o programa e digite outra operação\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */