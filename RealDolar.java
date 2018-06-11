package br.com.java;

import java.util.Scanner;

public class RealDolar {

	public static void main(String[] args) {
		double dolar = 3.75;
		double real;
		Scanner leia = new Scanner(System.in);
		System.out.println("#################################");
		System.out.println("Conversor de R$-Real para $-Dólar");
		System.out.println("#################################");
		System.out.println("Entre com o valor do Real");
		real = leia.nextDouble();
		real = real * dolar;
		System.out.println("___________________________");
		System.out.println("O valor do Real em Dólar é:\n" + "$" + real);

	}

}
