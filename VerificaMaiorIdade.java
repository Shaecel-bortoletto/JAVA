package br.com.java;

import java.util.Scanner;

public class VerificaMaiorIdade {

	public static void main(String[] args) {
		String nome;
		byte idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite seuidade");
		idade = teclado.nextByte();
		System.out.println("");
		System.out.println("________________________");
		System.out.println("Nome" + nome);
		System.out.println("Idade" + idade);
		if (idade <18) {
			System.out.println("menor de idade");
			
		} else {
			System.out.println("Maior de idade");
		}
		
	}

}
