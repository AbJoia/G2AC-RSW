programa
{
	
	funcao inicio()
	{
		caracter letra

		leia(letra)
		limpa()

		se (letra == 'a' ou letra == 'e' ou letra == 'i' ou letra == 'o' ou letra == 'u')
		{
			escreva(letra, " é uma vogal")
		}
		senao se (letra == 'q' ou letra == 'w' ou letra == 'r' ou letra == 't' ou letra == 'y' ou
				letra == 'p' ou letra == 's' ou letra == 'd' ou letra == 'f' ou letra == 'g' ou
				letra == 'h' ou letra == 'j' ou letra == 'k' ou letra == 'l' ou letra == 'ç' ou
				letra == 'z' ou letra == 'x' ou letra == 'c' ou letra == 'v' ou letra == 'b' ou
				letra == 'n' ou letra == 'm')
		{
			escreva(letra, " é uma consoante")
		}
		senao
		{
			escreva("ERRO!!!\n\n", "Por favor, reinicie o programa e digite outra letra\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */