package Exercicio_15;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println(">>> Programa que identifica pessoa no crime ocorrido! <<<\n");
		
		System.out.println("Telefonou para a vítima?");
		String resp1 = ler.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = ler.next();
		
		System.out.println("Mora perto da vítima?");
		String resp3 = ler.next();
		
		System.out.println("Devia para a vítima?");
		String resp4 = ler.next();
		
		System.out.println("Já trabalhou com a vítima?");
		String resp5 = ler.next();
		
		//CONTAGEM DE RESPOSTAS
		int i = 0;
		 if (resp1.equalsIgnoreCase("S")) {
			i++;
		}if (resp2.equalsIgnoreCase("S")) {
			i++;
		}if (resp3.equalsIgnoreCase("S")) {
			i++;
		}if (resp4.equalsIgnoreCase("S")) {
			i++;
		}if (resp5.equalsIgnoreCase("S")) {
			i++;
		}
	   //-----
		// CLASSIFICAÇÃO DA PESSOA NO CRIME
		switch (i) {
		case 0:System.out.println("INOCENTE");break;
		case 1:
		case 2:System.out.println("SUSPEITA");break;
		case 3:
		case 4:System.out.println("CÚMPLICE");break;
		case 5:System.out.println("ASSASSINA");break;
		}
		// OU
		if (i == 0 ) {
			System.out.println("INOCENTE");
		} else if (i == 1 || i ==2) {
			System.out.println("SUSPEITA");
		}else if(i == 3 || i ==4){
			System.out.println("CÚMPLICE");
		}else if(i == 5) {
			System.out.println("ASSASSINA");
	    }
	}

}
