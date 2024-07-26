/* 9- Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/

package Exercicio_15;

import java.util.Scanner;

public class Exer_9 {

	public static void main(String[] args) {
/*
		// Possiveis combinações:
		// x > y > z --------- x > z > y
		// y > x > z --------- y > z > x
		// z > x > y --------- z > y > x
		
		if( ( x > y && x > z ) && ( y > z ) ) { //  x > y > z
		    System.out.println(x);
		    System.out.println(y);
		    System.out.println(z);
		}
		else if( ( x > y && x > z ) && ( z > y ) ) { // x > z > y
		    System.out.println(x);
		    System.out.println(z);
		    System.out.println(y);
		}
		else if( ( y > x && y > z ) && ( x > z ) ) { //y > x > z
		    System.out.println(y);
		    System.out.println(x);
		    System.out.println(z);
		}
		else if( ( y > x && y > z ) && ( z > x ) ) { // y > z > x
		    System.out.println(y);
		    System.out.println(z);
		    System.out.println(x);
		}
		else if( ( z > x && z > y ) && ( x > y ) ) { // z > x > y
		    System.out.println(z);
		    System.out.println(x);
		    System.out.println(y);
		}
		else if( ( z > x && z > y ) && ( y > x ) ) { // z > y > x
		    System.out.println(z);
		    System.out.println(y);
		    System.out.println(x);
		}
		*/
		
		Scanner ler =new Scanner (System.in);
		System.out.println("****Programa que mostra numeros em ordem decrescentes****=");
		
		System.out.println("Entre com primeiro número: ");
		int n1 =ler.nextInt();
		System.out.println("Entre com segundo número: ");
		int n2 =ler.nextInt();
		System.out.println("Entre com terceira número: ");
		int n3 =ler.nextInt();
		
		
		if( ( n1 > n2 && n1 > n3 ) && ( n2 > n3 ) ) { //  x > y > z
		    System.out.println("------");
			System.out.println(n1);
		    System.out.println(n2);
		    System.out.println(n3);
		}else if( ( n1 > n2 && n1 > n3 ) && ( n3 > n2 ) ) { // x > z > y
			System.out.println("------");
			System.out.println(n1);
		    System.out.println(n3);
		    System.out.println(n2);
		}else if( ( n2 > 1 && n2 > n3 ) && ( n1 > n3 ) ) { //y > x > z
			System.out.println("------");
			System.out.println(n2);
		    System.out.println(n1);
		    System.out.println(n3);
		}else if( ( n2 > n1 && n2 > n3 ) && ( n3 > n1 ) ) { // y > z > x
			System.out.println("------");
			System.out.println(n1);
		    System.out.println(n3);
		    System.out.println(n2);
		}else if( ( n3 > n1 && n3 > n2 ) && ( n1 > n2 ) ) { // z > x > y
			System.out.println("------");
			System.out.println(n3);
		    System.out.println(n1);
		    System.out.println(n2);
		}else if( ( n3 > n1 && n3 > n2 ) && ( n2 > n1 ) ) { // z > y > x
			System.out.println("------");
			System.out.println("num: " + n3);
		    System.out.println("num: " + n2);
		    System.out.println("num: " + n1);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
