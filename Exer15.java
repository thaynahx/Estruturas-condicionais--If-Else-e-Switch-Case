/* 15.Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.

o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;*/

package Exercicio_15;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		// REFAZÊ-LO
		Scanner scan = new Scanner(System.in);
		System.out.println(">>> Programa que identifica o tipo de triângulo <<<\n");
		
        System.out.println("Entre com o lado 1:");
        int lado1 = scan.nextInt();

        System.out.println("Entre com o lado 2:");
        int lado2 = scan.nextInt();

        System.out.println("Entre com o lado 3:");
        int lado3 = scan.nextInt();
        System.out.println("----");
        
        if (((lado1 + lado2) > lado3) || 
            ((lado1 + lado3) > lado2) || 
            ((lado2 + lado3) > lado1)) {

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Forma: Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Forma:Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Forma: Triângulo Isóceles");
            }

        } else {
            System.out.println("não forma um triângulo");
        }
        
    }
}
	


