package br.com.java;

import java.util.Scanner;

public class CelsiusFahrenheit {
	static double coversaoCelsiusFahrenheit(double C) {
		return 9 * C / 5 + 32;

	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero Celsius: ");
		double celsius = leitor.nextDouble();
		System.out.println("O numero convertido em Fahrenheit é: ");
		System.out.println(coversaoCelsiusFahrenheit(celsius));

	}

}
