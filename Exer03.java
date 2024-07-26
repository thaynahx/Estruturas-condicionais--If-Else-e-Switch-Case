/*3- Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/ 

package Exercicio_15;

import java.util.Scanner;

public class Exer_3 {

	public static void main(String[] args) {
	Scanner ler =new Scanner (System.in);
	System.out.println("*****Programa que verifica letra digitada*****");
	
	System.out.println("Entre com (f/m):");
	String letra = ler.next();
	
	if (letra.equalsIgnoreCase("F")||
		letra.equalsIgnoreCase("f")) {
		System.out.println("F- Feminino");
	}else if (letra.equalsIgnoreCase("M")||
			letra.equalsIgnoreCase("m")) {
		System.out.println("M- Masculino");
	}
	
//	switch (letra) {
//	case "F":
//	case "f":System.out.println("F -  feminino");
//		break;
//	case "M":
//	case "m":System.out.println("M -  masculino");
//		break;
//	default: System.out.println("Valor inválido!");
//		break;
//	}
	
	
}
}
