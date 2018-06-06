package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// A linha abaixo cria variaveis do tipo real
		float nota1, nota2, media;
		// Entrada
		System.out.print("Digite a nota1:");
		// a linha abaixo cria um objeto de nome teclado usando scanner (biblioteca de
		// leitura)
		Scanner teclado = new Scanner(System.in);
		// a linha a baixo usa o objjeto teclado para capturar o que foi
		// digitado no console e armazena na variavel nota1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a nota2:");
		nota2 = teclado.nextFloat();
		// processamento
		media = (nota1 + nota2) / 2;
		// saida
		// + concatena(junta) um texto com o conteudo da variavel media
		System.out.println("Media final :" + media);
		// estrutura condicional para verificar o status
		if (media >= 5) {
			System.out.println("APROVADO");

		} else {
			System.out.println("REPROVADO");
		}

	}

}
