package Exercicio_15;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

	Scanner ler =new Scanner(System.in);
	System.out.println("*****Cáuculo para Folha de pagamento: *****\n");
	
	System.out.println("Entre com o valor da sua hora: (Valor/hora)");
	double valorHora =ler.nextDouble();
	System.out.println("Entre com a quantidade de horas trabalhadas:");
	double qtdHora = ler.nextDouble();
	
	double salarioBruto = valorHora * qtdHora;
	
	int percentualIr = 0;
	
	if (salarioBruto <= 900) {
		percentualIr =0;
	} else if (salarioBruto > 900 && salarioBruto <= 1500) {
		percentualIr = 5;
	} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
		percentualIr = 10;
	}else if (salarioBruto > 2500) {
		percentualIr= 20;
	}
	
	double ir = (salarioBruto/100)*percentualIr;
	double inss= salarioBruto/100*10;
	double fgts = salarioBruto/100*11;
	double descontos = inss + ir;
	double salarioLiquido = salarioBruto - descontos;
	
	
	System.out.println("**** FOLHA DE PAGAMENTO ****");
	System.out.println("_________________________________________________________");
	System.out.println("|Salario Bruto: ("+valorHora+" * "+qtdHora+")                 : R$ "+salarioBruto+"|");
	System.out.println("|(-) IR (" +percentualIr+"%)                                  : R$ "+ ir+"  |");
	System.out.println("|(-) INSS ( 10%)                              : R$ "+ inss+" |");
	System.out.println("|FGTS (11%)                                   : R$ "+ fgts+" |");
	System.out.println("|Total de descontos                           : R$ " + descontos+" |");
	System.out.println("|Salario Líquido                              : R$ " + salarioLiquido+" |");
	System.out.println("|________________________________________________________|");
	
	
	
	
	}
}
