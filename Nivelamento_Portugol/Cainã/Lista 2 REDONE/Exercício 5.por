programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia sexo, condicao

		leia(idade)
		leia(sexo)
		leia(condicao)
		limpa()
		
		se (idade > 60)
		{
			escreva("Fila preferencial")
		}
		senao se (condicao == "deficiente")
		{
			escreva("Fila preferencial")
		}
		senao se (sexo == "mulher" e condicao == "gestante")
		{
			escreva("Fila preferencial")
		}
		senao
		{
			escreva("Fila comum")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */