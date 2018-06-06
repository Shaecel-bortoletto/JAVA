package br.com.java;

import java.util.Scanner;

public class Operadores_Aritmeticos {

	public static void main(String[] args) {
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Operadores Aritmeticos ");
		System.out.println(" Digite o valor de x: ");
		x = teclado.nextFloat();
		System.out.println(" Digite o valor de y");
		y = teclado.nextFloat();
		// soma
		System.out.println("x + y = " + (x + y));
		// Subtracao
		System.out.println("x - y = " + (x - y));
		// Divisao
		System.out.println("x / y = " + (x / y));
		// Multiplicacao
		System.out.println("x * y = " + (x * y));
		// Modulo
		System.out.println("x % y = " + (x % y));
		// Incremento x++ ( equivale a x = x +1)
		x++;
		System.out.println("x++ " + x);
		// Decremento y-- (equivale a y = y - 1)
		y--;
		System.out.println("y--" + y);
	}

}
