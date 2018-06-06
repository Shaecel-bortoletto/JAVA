package br.com.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// A linha a Baixo cria o objeto Teclado.
		Scanner teclado = new Scanner (System.in);
		// A linha abaixo cria o objeto formatador 
		DecimalFormat formatador = new DecimalFormat ("#0.00");
		// A regra de criacao de variaveis ​​numericas
		double peso ,altura , imc; 
		System.out.println("Digite seu peso");
		peso= teclado.nextDouble();
		System.out.println("Digite sua Altura");
		altura= teclado.nextDouble();
		// A linha a baixo faz o calculo do IMC.
		imc= peso/(altura*altura);
		// A linha a Baixo mostra o resultado IMC.
		System.out.println("imc e : " + formatador.format(imc));
	}	

}
