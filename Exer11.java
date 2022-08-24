package Exercicio_15;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner ler =new Scanner(System.in);
		System.out.println("****Programa que calcula reajuste de fucionário****\n");
		
		System.out.println("Entre com o salário do Colaborador:");
		double salario = ler.nextDouble();
		
		int percentual = 0 ;
	if (salario <= 280 ) {
		percentual = 20;
	} else if (salario > 280 && salario <= 700) {
		percentual = 15;
	} else if (salario > 700 && salario <= 1500) {
		percentual = 10;
	}else if (salario > 1500) {
		percentual = 5;
	}
	
	double aumento = (salario / 100) * percentual;
	double reajuste = salario + aumento;
	
	System.out.println("=========");
	System.out.println("Salário atual: " + salario );
	System.out.println("Percentual: " + percentual);
	System.out.println("Valor do aumento: " + aumento);
	System.out.println("Salário reajustado: " +  reajuste); 
	
	}

}
