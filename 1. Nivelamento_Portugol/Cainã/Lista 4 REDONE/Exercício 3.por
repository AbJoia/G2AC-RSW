programa
{

	const real mediaTotal = 7.0
	real nota1, real nota2
	
	funcao inicio()
	{
		inteiro alunos, a
		
		escreva("Número de alunos: ")
		leia(alunos)
		limpa()

		para (a = 1; a <= alunos; a++)
		{
			escreva("Digite a nota 1 do aluno ", a, " : ")
			leia(nota1)
			escreva("Digite a nota 2 do aluno ", a, " : ")
			leia(nota2)
			limpa()
			verificaSituacao (a)
		}
	}

	funcao real mediaAluno (real n1, real n2)
	{
		retorne (nota1 + nota2) / 2
	}

	funcao verificaSituacao (inteiro a)
	{
		se (mediaAluno(nota1, nota2) > mediaTotal)
		{
			escreva("Aluno ", a, " passou\n\n")
		}
		senao
		{
			escreva("Aluno ", a, " não passou\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */