package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		// variaveis

		double valorAlcool;
		double valorGasolina;

		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("Digite o valor do alcool: ");
		valorAlcool = teclado.nextDouble();
		System.out.println("Digite o valor do gasolina: ");
		valorGasolina = teclado.nextDouble();

		if (valorAlcool <= (valorGasolina * 0.7)) {
			System.out.print("Alcool é melhor");
		} else {
			System.out.print("Gasolina é melhor");
		}

	}

}
