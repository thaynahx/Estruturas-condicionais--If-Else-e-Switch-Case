/* Um posto está vendendo combustíveis com a seguinte tabela de
descontos:

. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.*/

package Exercicio_15;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println(">>> Programa de posto de combustível <<< \n");
		
		System.out.println("Entre com o total de litros vendidos: ");
		double litros = ler.nextDouble();
		System.out.println("Entre com o tipo do combústivel: (A-álcool, G-gasolina)");
		String tipo = ler.next();
	
		double gasolina = 2.50;
		double alcool = 1.90;
		double total = 0;
		
		int desconto = 0 ;
		if (tipo.equalsIgnoreCase("a")) {
			
			if (alcool <= 20) {
				desconto=3;
			} else {
				desconto=5;
			}
			
			total = litros * alcool;
			
		} else if (tipo.equalsIgnoreCase("g")) {
			
			if (gasolina <= 20) {
				desconto=4;
			}else {
				desconto=6;
			}
			
			total = litros * gasolina;
		}
		
		double totalDesc = (total/100) * desconto;
		double valorTotal = (total - totalDesc);
		
		System.out.println("*** RECIBO *** \n");
		System.out.println("Valor a ser pago pelo cliente: " +valorTotal);
		System.out.println("----------------------------");
		System.out.println("Litros solicitado: " + litros);
		System.out.println("Tipo do combustível: " + tipo);
		System.out.println("desconto adquirido: " + desconto);
		System.out.println("Total: " + total);
		System.out.println("Total de descontos: " + totalDesc);
		
		
	}

}
