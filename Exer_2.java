package Exercicio_15;

import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {

		Scanner ler= new Scanner (System.in);
		System.out.println("*****Negativo ou Positivo*****");
		
		System.out.println("Entre com um n�mero:");
		int num =ler.nextInt();
		
		if (num > 0) {
			System.out.println("N�mero positivo.");
		}else {
			System.out.println("N�mero negativo.");
		}
	}

}
