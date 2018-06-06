package br.com.java;

import java.util.Scanner;

public class Rgra3 {

	public static void main(String[] args) {
		double x,y,valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Regra de 3");
		System.out.println("x % de y = valor");
		System.out.println("");
		//entrada
		System.out.print("Digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de y:");
		y = teclado.nextDouble();
		// processamento
		valor = (x  * y) / 100;
		//saida
		System.out.println(x + "% de" + y +" = " + valor);
		
	}

}
