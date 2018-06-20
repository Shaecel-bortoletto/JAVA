/**
 * Atividade de avaliação - Churrascoladora
 * @autor Marcio Roberto, Anselmo Bortoletto
 */

package br.com.java;

import java.util.Scanner;

public class Churrascoladora {

	public static void main(String[] args) {
		// Variaveis
		int homens, mulheres, criancas;
		double carne, cerveja, refri, r$carne, r$cerveja, r$refri,quant, preco, res,total;

		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("=====CHURRASCOLADORA=====");
		System.out.println("Quantidade de Homens: ");
		homens = teclado.nextInt();
		System.out.println("Quantidade de Mulheres: ");
		mulheres = teclado.nextInt();
		System.out.println("Quantidade de Crianças: ");
		criancas = teclado.nextInt();
		System.out.println("Preço médio do Kg da Carne: ");
		carne = teclado.nextInt();
		System.out.println("Preço médio da lata de Cerveja: ");
		cerveja = teclado.nextInt();
		System.out.println("Preço médio da lata de refrigerante: ");
		refri = teclado.nextInt();
		// processamento
		quant = (homens * 12) + (mulheres * 4);
		r$cerveja = (quant * cerveja);
		r$carne = ((homens + mulheres)*300)+(criancas*100)/1000;
		preco = r$carne * carne;
		// saída
		System.out.println("");
		System.out.println("___________________________________");
		System.out.println("Lista de compras: ");
		// exibir quantidade e preço
		System.out.println("Quantidade total de Carne: " + r$carne + " KG " +  " R$ " + preco );
		System.out.println("Quantidade total de Cerveja: " +quant + " latas " +  " R$ " + r$cerveja );	
		quant = (mulheres * 2) + (criancas * 2);
		r$refri = (quant * refri);
		res= preco+r$refri+r$cerveja;
		total= res/(homens + mulheres);
		System.out.println("Quantidade total de Refrigerante: " +quant + " latas " +  " R$ " + r$refri);
		System.out.println("");
		System.out.println("____________________________________");
		System.out.println("Valor total do Churrasco: " + res );
		System.out.println("Valor por pessoa: " + total);

	}

}
