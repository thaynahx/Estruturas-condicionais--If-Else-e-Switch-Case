package Exercicio_15;

import java.util.Scanner;

public class Exer_5 {

	public static void main(String[] args) {
		
		Scanner ler =new Scanner (System.in);
		System.out.println("***Programa de Leitura de notas parciais!***");
		
		System.out.println("Entre com a 1ª nota:");
		double n1 = ler.nextDouble();
		System.out.println("Entre com a 1ª nota:");
		double n2 = ler.nextDouble();
		
		double soma = (n1 + n2);
		double media = soma / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção!");
		}else if(media >= 7) {
			System.out.println("Aprovado!");
		}else {
			System.err.println("Reprovado!");
		}
		
		System.out.println("Soma das notas: " + soma);
		System.out.println("Média da nota: " + media);
	}

}
