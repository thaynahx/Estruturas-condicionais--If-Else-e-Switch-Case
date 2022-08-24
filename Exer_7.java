package Exercicio_15;

import java.util.Scanner;

public class Exer_7 {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		System.out.println("*****Número maior*****");
		
		System.out.println("Entre com o primeiro número:");
		int numero1 =ler.nextInt();
		System.out.println("Entre com o segundo número:");
		int numero2 =ler.nextInt();
		System.out.println("Entre com o terceiro número:");
		int numero3 =ler.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Número 1 é maior. ");
		}else if (numero2 > numero1 && numero2 > numero3){
			System.out.println("Número 2 é maior.");
		}else {
			System.out.println("Número 3 é maior.");
		}
	
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("Número 1 é menor. ");
		}else if (numero2 < numero1 && numero2 < numero3){
			System.out.println("Número 2 é menor.");
		}else {
		System.out.println("Número 3 é menor.");
		}
}
	


}
