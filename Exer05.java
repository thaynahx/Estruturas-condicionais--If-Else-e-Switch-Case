/*5- Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez. */

package Exercicio_15;

import java.util.Scanner;

public class Exer_5 {

	public static void main(String[] args) {
		
		Scanner ler =new Scanner (System.in);
		System.out.println("***Programa de Leitura de notas parciais!***");
		
		System.out.println("Entre com a 1ª nota:");
		double n1 = ler.nextDouble();
		System.out.println("Entre com a 1ª nota:");
		double n2 = ler.nextDouble();
		
		double soma = (n1 + n2);
		double media = soma / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção!");
		}else if(media >= 7) {
			System.out.println("Aprovado!");
		}else {
			System.err.println("Reprovado!");
		}
		
		System.out.println("Soma das notas: " + soma);
		System.out.println("Média da nota: " + media);
	}

}
