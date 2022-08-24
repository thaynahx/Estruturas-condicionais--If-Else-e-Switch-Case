package Exercicio_15;

import java.util.Iterator;
import java.util.Scanner;

public class Exer_4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("*****Programa que verifica vogal/consoante*****");
	
		//Adaptado com a estrutura de repetição
		// for (int i = 0; i < 25; i++) {
		System.out.println("Entre com uma letra:");
		String letra = ler.next();
		
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":System.out.println("VOGAL");
			break;
		default:System.out.println("CONSOANTE");
			break;
			
//		}
	}
		
}
}
