package Exercicio_15;

import java.util.Scanner;

public class Exer_1 {
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		System.out.println("*****Número maior*****");
		
		System.out.println("Entre com o primeiro número:");
		int numero1 =ler.nextInt();
		System.out.println("Entre com o segundo número:");
		int numero2 =ler.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("Número 1 é maior. ");
		}else {
			System.out.println("Número 2 é maior.");
		}
	}
	
	
}
