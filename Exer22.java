package Exercicio_15;

import java.util.Scanner;

public class Exer22 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		System.out.println(" >>> Programa que caucula preço(kg) de frutas <<< \n");
		
		System.out.println("Entre com a quantidade de kilos de morangos: ");
		double kgMorango = ler. nextDouble();
		System.out.println("Entre com a quantidade de kilos de maçã: ");
		double kgMaca =ler.nextDouble();
		
		double precoKgMor=0;
		if (kgMorango <= 5) {
			precoKgMor = 2.50;
		}else {
			precoKgMor = 2.20;
		}
		double totalMor = precoKgMor * kgMorango;
		System.out.println("_____________________");
		System.out.println(">>> CUPOM FISCAL <<<\n");
		System.out.println("> Total Morango: "+totalMor);
		System.out.println("> Preço do Morango: " + precoKgMor);

		double precoKgMaca = 0;
		if (kgMaca <= 5) {
			precoKgMaca = 1.80;
		}else {
			precoKgMaca = 1.20;
		}
		double totalMaca = precoKgMaca * kgMaca;
		System.out.println("|");
		System.out.println("> Total Maçã: "+totalMaca);
		System.out.println("> Preço do Maçã: " + precoKgMaca);
		
		double totalFrutasKg = kgMaca + kgMorango;
		double totalFrutasPreco = precoKgMor + precoKgMaca;
		double totalFrutas = totalMaca + totalMaca;
		
		System.out.println("|");
		System.out.println("> Total de fruta(kg): " + totalFrutasKg );
		System.out.println("> Total do (preço) da Fruta: " +  totalFrutasPreco);
		System.out.println("> Valor (total) das frutas: "+ totalFrutas);
			
		double valorTotal = totalFrutasPreco;
		
		if (totalFrutasKg >= 8 || (totalFrutasPreco > 25.0) ) {
			valorTotal = totalFrutasPreco - ((totalFrutasPreco/100)*10);
		}
		System.out.println("|");
		System.out.println("> Valor a pagar: " + valorTotal);
		System.out.println("---------------------");
		
	
	
	}

}
