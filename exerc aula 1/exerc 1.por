programa
{
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias
	funcao inicio()
	{
	inteiro ano, mes, dia, totalDias

	escreva("\nQuantos anos você tem? ")
	leia(ano)
	escreva("\nQuantos meses você tem? ")
	leia(mes)
	escreva("\nQuantos dias você tem? ")
	leia(dia)

	totalDias = ano * 365 + mes * 30 + dia

	escreva ("\nEu vivi: ", totalDias, "dia(s) de vida")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */