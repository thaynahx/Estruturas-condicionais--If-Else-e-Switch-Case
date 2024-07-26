/*11.As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento*/

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
