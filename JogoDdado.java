package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JogoDdado {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner (System.in);
		do {
			// a linha abaixo usa a classe Random para criar um objeto que sera usado para gerar numeros aleatorios
			Random dado = new Random();
			int face = dado.nextInt(6) + 1;// Gerar numeros aleatorios (0 a 5) somamos 1 ao resultado pois nao existe a face 0 no dado
			System.out.println("Face do dado: " + face);
			System.out.println("deseja jogar novamente(s/n)? ");
			// charAt(0) captura apenas a 1a letra do que foi digitado
			opcao = teclado.next().charAt(0);
		}while(opcao == 's');

	}

}
