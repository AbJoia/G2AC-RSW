programa
{
	
	funcao inicio()
	{
		inteiro lado1, lado2, lado3

		leia(lado1)
		leia(lado2)
		leia(lado3)
		limpa()

		se (lado1 == lado2 e lado1 == lado3 e lado2 == lado3)
		{
			escreva("O triângulo é equilátero")
		}
		senao se (lado1 == lado2 e lado2 != lado3 e lado2 != lado3 ou
				lado1 == lado3 e lado1 != lado2 e lado3 != lado2 ou
				lado2 == lado3 e lado2 != lado1 e lado3 != lado1)
		{
			escreva("O triângulo é isósceles")			
		}
		senao se (lado1 != lado2 e lado1 != lado3 e lado2 != lado3)
		{
			escreva("O triângulo é escaleno")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */