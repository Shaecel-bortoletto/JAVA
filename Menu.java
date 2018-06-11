package br.com.java;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Windows");
		System.out.println("2. Linux");
		System.out.println(" Digite a opção desejada: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			windows();// execultar o metodo
			break;
		case 2:
			linux();
			break;
		default:// caso nenhuma opção selecionada
			System.out.println("Opção inválida");
			break;		
		}
	}
	// Criando um metodo
	static void windows() {
		System.out.println("Carregando oWindows.......");
		}
	
	static void linux() {
		System.out.println("carregando linux......");

	
	}
}