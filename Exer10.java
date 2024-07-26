/*10.Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/

package Exercicio_15;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o turno que você estuda:");
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
			System.out.println("Valor inválido!");
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
		default:System.out.println("Valor inválido!");
			break;
		}
		
		
	}

}
