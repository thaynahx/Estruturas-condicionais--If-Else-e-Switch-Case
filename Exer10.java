package Exercicio_15;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o turno que voc� estuda:");
		System.out.println("M - Matutino \n" + 
						   "V - Vespertino \n" + 
						   "N - Noturno");
		String turno = ler.next();
/*		
		if (turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("m") ) {
			System.out.println("Bom dia!");
		}else if (turno.equalsIgnoreCase("V") || turno.equalsIgnoreCase("v") ) {
			System.out.println("Boa tarde!");
		}else if (turno.equalsIgnoreCase("N") || turno.equalsIgnoreCase("n") ) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Valor inv�lido!");
		}
	*/	
		switch (turno) {
		case "M":
		case "m": System.out.println("Bom dia!"); 
			break;
		case "V": 
		case "v":System.out.println("Boa tarde!"); 
			break;
		case "N":
		case "n":System.out.println("Boa noite!"); 
			break;
		default:System.out.println("Valor inv�lido!");
			break;
		}
		
		
	}

}
