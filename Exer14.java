/*14- Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:

o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.*/


package Exercicio_15;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("*** Programa que calcula a média de notas de um aluno ***\n");
	
	String nome= "Mario";
	System.out.println("Entre com sua 1ª nota: ");
	double n1= ler.nextDouble();
	System.out.println("Entre com sua 2ª nota: ");
	double n2= ler.nextDouble();
	System.out.println("Entre com sua 3ª nota: ");
	double n3= ler.nextDouble();
	System.out.println("Entre com sua 4ª nota: ");
	double n4= ler.nextDouble();
	
	double soma = n1+n2+n3+n4;
	double media= soma / 4;
	
	String aproveitamento = "";
	if (media >= 0 && media < 4 ) {
		aproveitamento = "E";
	} else if (media >= 4 && media < 6) {
		aproveitamento = "D";
	}else if (media >= 6 && media < 7.5) {
		aproveitamento = "C";
	}else if (media >= 7.5 && media < 9) {
		aproveitamento = "B";
	}else if (media >= 9 && media <= 10) {
		aproveitamento = "A";
	}
	
	System.out.println("\n---------------------");
	System.out.println("Nome: " + nome + "\n");
	System.out.println("Nota 1: " + n1);	
	System.out.println("Nota 2: " + n2);
	System.out.println("Nota 3: " + n3);
	System.out.println("Nota 4: " + n4);
	System.out.println("Soma das notas: " + soma);
	System.out.println("Média: " + media+"\n");
	System.out.println("Conceito: " + aproveitamento);
	System.out.println("---------");		
	
	switch (aproveitamento) {
	case "A": 
	case "B":  
	case "C": System.out.println("APROVADO"); break;
	case "D": 
	case "E": System.out.println("REPROVADO"); break;
	}
	
	System.out.println("---------------------");
	
	}
}
