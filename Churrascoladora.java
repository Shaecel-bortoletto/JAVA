/**
 * @author Marcio Roberto Leite da Silva / Anselmo Bortoletto
 * Date 06/21/2018 
 * Nome do projeto: Churrascoladora
 * Classe para montar a calculadora de churrasco
 */
package br.com.java;

import java.util.Scanner;

public class Churrascoladora {
	/* Método principal */
	public static void main(String[] args) {
		// A linha abaixo cria variáveis numéricas do tipo inteiro
		int homem, mulher, crianca;
		// A linha abaixo cria variáveis numéricas de precisão
		double precoCarne, precoCerveja, precoRefri, totalCarne, totalCerveja, totalRefri, totalChurras;
		// A linha abaixo cria o objeto teclado que
		// será usado pela classe Scanner
		Scanner teclado = new Scanner(System.in);
		System.out.println("=========================");
		// A linha abaixo exibe o nome do programa para o usuário
		System.out.println("=====CHURRASCOLADORA=====");
		System.out.println("=========================");
		// As linhas abaixo solicitam as informações que serão necessárias para fazermos
		// os cálculos
		System.out.println("Quantidade de Homens: ");
		homem = teclado.nextInt();
		System.out.println("Quantidade de mulheres: ");
		mulher = teclado.nextInt();
		System.out.println("Quantidade de crianças: ");
		crianca = teclado.nextInt();
		System.out.println("Preço da Carne (Kg): ");
		precoCarne = teclado.nextInt();
		System.out.println("Preço da Cerveja: ");
		precoCerveja = teclado.nextInt();
		System.out.println("Preço do refrigerante: ");
		precoRefri = teclado.nextInt();
		// As linhas abaixo executam todo processamento e exibem os resultados para o
		// usuário
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