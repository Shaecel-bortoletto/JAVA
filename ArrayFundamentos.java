package br.com.java;

public class ArrayFundamentos {

	public static void main(String[] args) {
		String time1 = "Corinthians";
		String time2 = "Palmeiras";
		String time3 = "Santos";
		String time4 = "São Paulo";
		System.out.println(" Fundamentos do Array");
		System.out.println("Exemplo 1: Sem Array");
		System.out.println("Time: " + time3);
		// A linha a baixo cria um vetor simples
		String[] times = {"corinthians","Palmeiras","Santos","São Paulo"}; 
		System.out.println("Exemplo 2: Com Array");
		//A linha a baixo recupera o conteúdo do indice[0] do Array
		System.out.println("Time: " + times[0]);
		// a linha a baixo modifica o conteúdo do indice [2] do Array
		times[2] = "Flamengo";
		System.out.println("Exemplo 3: Modifica um Array");
		System.out.println("Time: " + times[2]);
		// obtendo o tamanho total do array
		System.out.println("Total de times:" + times.length);
		

	}

}
