package br.com.java;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		double area, raio;
		System.out.println("Insira o valor do Raio:");
		raio = teclado.nextDouble();
		area = 2 * Math.PI * raio;
		System.out.println("A area é " + area); 
		
		
	}

}
