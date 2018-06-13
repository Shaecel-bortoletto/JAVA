/**
 * Atividade JokenPo
 * @author Marcio Roberto / Anselmo Bortoletto
 * Date 06/13/2018
 * */
package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		int jogador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Pedra\n2. Papel\n3. Tesoura");
		// System.out.println("2. Papel");
		// System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu pedra: ");
			break;
		case 2:
			System.out.println("Jogador escolheu papel: ");
			break;
		case 3:
			System.out.println("Jogador escolheu tesoura: ");
			break;
		default:
			System.out.println("opção inválida");
			break;
		}
		// Lógica do computador
		// criar uma variável que recebe um valor aleatório (1,2 ou 3)
		Random mao = new Random();
		int computador = mao.nextInt(3) + 1;
		switch (computador) {
		case 1:
			System.out.println("Pc escolheu pedra: ");
			break;
		case 2:
			System.out.println("Pc escolheu papel: ");
			break;
		case 3:
			System.out.println("Pc escolheu tesoura: ");
			break;
		}
		// Lógica para determinar o vencedor
		if (jogador != computador) {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("jogador venceu");
			} else {
				System.out.println("pc venceu");
			}
		} else {
			System.out.println("Empate");
		}
	}
}
