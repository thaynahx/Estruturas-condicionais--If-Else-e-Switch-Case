/*8- Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/

package Exercicio_15;

import java.util.Scanner;

public class Exer_8 {

	public static void main(String[] args) {

		Scanner ler =new Scanner(System.in);
		System.out.println("*****Produto mais barato*****");
		
		System.out.println("Entre com o preço do produto 1: ");
		double v1 =ler.nextDouble();
		System.out.println("Entre com o preço do produto 2: ");
		double v2 =ler.nextDouble();
		System.out.println("Entre com o preço do produto 3: ");
		double v3 =ler.nextDouble();
		System.out.println("---------------");
		if (v1 < v2 && v1 < v3) {
			System.out.println("Compre o primeiro produto");
			System.out.println("Valor: " + v1);
		}else if (v2 < v1 && v2 < v3){
			System.out.println("Compre o segundo produto");
			System.out.println("Valor: " + v2);
		}else {
			System.out.println("Compre o terceiro produto");
			System.out.println("Valor: " + v3);
		}
		
	
		
   }

} 
