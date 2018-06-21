/**
 * @author Marcio Roberto Leite da Silva / Anselmo Bortoletto
 * Date 06/21/2018 
 * Nome do projeto: Churrascoladora
 * Classe para montar a calculadora de churrasco
 */
package br.com.java;

import java.util.Scanner;

public class Churrascoladora {
	/* M�todo principal */
	public static void main(String[] args) {
		// A linha abaixo cria vari�veis num�ricas do tipo inteiro
		int homem, mulher, crianca;
		// A linha abaixo cria vari�veis num�ricas de precis�o
		double precoCarne, precoCerveja, precoRefri, totalCarne, totalCerveja, totalRefri, totalChurras;
		// A linha abaixo cria o objeto teclado que
		// ser� usado pela classe Scanner
		Scanner teclado = new Scanner(System.in);
		System.out.println("=========================");
		// A linha abaixo exibe o nome do programa para o usu�rio
		System.out.println("=====CHURRASCOLADORA=====");
		System.out.println("=========================");
		// As linhas abaixo solicitam as informa��es que ser�o necess�rias para fazermos
		// os c�lculos
		System.out.println("Quantidade de Homens: ");
		homem = teclado.nextInt();
		System.out.println("Quantidade de mulheres: ");
		mulher = teclado.nextInt();
		System.out.println("Quantidade de crian�as: ");
		crianca = teclado.nextInt();
		System.out.println("Pre�o da Carne (Kg): ");
		precoCarne = teclado.nextInt();
		System.out.println("Pre�o da Cerveja: ");
		precoCerveja = teclado.nextInt();
		System.out.println("Pre�o do refrigerante: ");
		precoRefri = teclado.nextInt();
		// As linhas abaixo executam todo processamento e exibem os resultados para o
		// usu�rio
		totalCarne = (((homem + mulher) * 300) + (crianca * 100)) / 1000;
		System.out.println("Total de carne: " + (totalCarne) + " Kg " + " R$ " + totalCarne * precoCarne);
		totalCerveja = (homem * 12) + (mulher * 4);
		System.out.println("Total de cerveja: " + totalCerveja + " latas " + " R$ " + (totalCerveja * precoCerveja));
		totalRefri = (mulher + crianca) * 2;
		System.out.println("Total de refrigerante: " + totalRefri + " latas " + " R$ " + (totalRefri * precoRefri));
		totalChurras = (totalCarne * precoCarne) + (totalCerveja * precoCerveja) + (totalRefri * precoRefri);
		System.out.println("Total do Churrasco: R$ " + totalChurras);
		totalChurras = totalChurras / (homem + mulher);
		System.out.println("total por pessoa: R$ " + totalChurras);
	}

}