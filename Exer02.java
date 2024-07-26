/* 2- Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.*/

package Exercicio_15;

import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {

		Scanner ler= new Scanner (System.in);
		System.out.println("*****Negativo ou Positivo*****");
		
		System.out.println("Entre com um número:");
		int num =ler.nextInt();
		
		if (num > 0) {
			System.out.println("Número positivo.");
		}else {
			System.out.println("Número negativo.");
		}
	}

}
