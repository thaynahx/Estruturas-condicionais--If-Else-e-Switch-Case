package Exercicio_15;

import java.util.Scanner;

public class Exer_1 {
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		System.out.println("*****N�mero maior*****");
		
		System.out.println("Entre com o primeiro n�mero:");
		int numero1 =ler.nextInt();
		System.out.println("Entre com o segundo n�mero:");
		int numero2 =ler.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("N�mero 1 � maior. ");
		}else {
			System.out.println("N�mero 2 � maior.");
		}
	}
	
	
}
