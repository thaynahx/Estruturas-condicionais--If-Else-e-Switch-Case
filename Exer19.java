package Exercicio_15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println(">>> Programa que identifica nºs (PAR/ÌMPAR) e (POSITIVO/NEGATIVO) <<< \n");
		
		System.out.println("Entre com o primeiro número:");
		double n1 = ler.nextDouble();
		System.out.println("Entre com o segundo número:");
		double n2 = ler.nextDouble();
		
		System.out.println("Qual operação desejas utilizar? (+ - * /)");
		String operacao = ler.next();
		
		double resultado= 0;
		switch (operacao) {
		case "+": resultado = n1+n2; break;
		case "-": resultado = n1-n2; break;
		case "*": resultado = n1*n2; break;
		case "/": resultado = n1/n2; break;
		default:
			break;
		}
		
		System.out.println("NÚMERO 1: " + n1);
		System.out.println("OPERAÇÂO: " + operacao);
		System.out.println("NÚMERO 2: " + n2);
		System.out.println("----");
		System.out.println("RESULTADO = " + resultado);
		
		
		if (resultado % 2 == 0) {
			System.out.println("RESULTADO = PAR");
		}else {
			System.out.println("RESULTADO = ÍMPAR");
		}


		if (resultado > 0 ) {
			System.out.println("RESULTADO = POSITIVO");
		}else {
			System.out.println("RESULTADO = NEGATIVO");
		}
		
		
	}

}
