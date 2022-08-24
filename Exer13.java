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
		
		
		
		
	}

}
