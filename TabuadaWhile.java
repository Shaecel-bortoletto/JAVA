package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int i = 1;
		int  valor; //Variável de apoio ao laço while
		Scanner teclado = new Scanner (System.in);
		System.out.println(" __TABUADA__");
		System.out.println("");
		System.out.println("Digite o Valor da tabuada");
		valor = teclado.nextInt();
		System.out.println("");
		while (i < 11) {
		System.out.println(valor + " x " + i +" = " + (valor * i));
		i++;
		}
	}
}
