/*13.Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido.*/

package Exercicio_15;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número que corresponde ao dia da semana: ");
		int diaSemana = scan.nextInt();
		System.out.println("--------");
		switch (diaSemana) {
		case 1: System.out.println(diaSemana+ "- Domingo");  break;
		case 2: System.out.println(diaSemana+ "ª- Segunda-feira");  break;
		case 3: System.out.println(diaSemana+ "ª- Terça-feira");  break;
		case 4: System.out.println(diaSemana+ "ª- Quarta-feira");  break;
		case 5: System.out.println(diaSemana+ "ª- Quinta-feira");  break;
		case 6: System.out.println(diaSemana+ "ª- Sexta-feira");  break;
		case 7: System.out.println(diaSemana+ "- Sábado");  break;
		default:System.out.println("Valor inválido, digite novamente!");
			break;
		}

		/*
		int diaSemana = ler.nextInt();
		if (diaSemana == 1 ) {
			System.out.println("Domingo");
		} else if (diaSemana == 2 ) {
			System.out.println("Segunda=feira");
		}else if (diaSemana == 3 ) {
			System.out.println("Terça-feira");
		}else if (diaSemana == 4 ) {
			System.out.println("Quarta=feira");
		}else if (diaSemana == 5 ) {
			System.out.println("Quinta-feira");
		}else if (diaSemana == 6 ) {
			System.out.println("Sexta-feira");
		}else if (diaSemana == 7 ) {
			System.out.println("Sábado");
		} else {
			System.out.println("Valor inválido, tente novamente!");
		}
		*/

		
		
		
		
	}

}
