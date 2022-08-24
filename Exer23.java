package Exercicio_15;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println(">>> Programa do Hipermercado Tabajara <<<\n");

		System.out.println("Entre com o tipo da carne desejada:\n");
		System.out.println("1 - Filé duplo ");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipy = ler.nextInt();

		System.out.println("Entre com a quantidade(kg) desejada: ");
		double kgQtd = ler.nextDouble();

		double precokg = 0;

		if (tipy == 1) {
			System.out.println(kgQtd + " kg - Filé duplo\n");

			if (kgQtd <= 5) {
				precokg = 4.9;
			} else {
				precokg = 5.8;
			}

		} else if (tipy == 2) {
			System.out.println(kgQtd + " kg - Alcatra\n");

			if (kgQtd <= 5) {
				precokg = 5.9;
			} else {
				precokg = 6.8;
			}

		} else if (tipy == 3) {
			System.out.println(kgQtd + " kg - Picanha\n");

			if (kgQtd <= 5) {
				precokg = 6.9;
			} else {
				precokg = 7.8;
			}
		}

		double total = kgQtd * precokg;
		System.out.println("Total: "+ kgQtd + "kg * R$" + precokg + " = R$" + total + ";");
		
		System.out.println("-----------");
		System.out.println("Compra no cartão? digite 1;");
		System.out.println("Compra em espécie? digite 2;");
		int pag = ler.nextInt();
		
		double desconto = 0; 
		if (pag == 1) {
			System.out.println("1- Cartão");
			//double
			desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			//valortotal = (total - desconto);
		}else if (pag == 2) {
			System.out.println("2- Espécie");
			System.out.println("Não houve desconto!");
		}
		
		double valorTotal = (total - desconto);
		System.out.println("---------------------------");
		System.out.println(">>> Cupom Fiscal <<<\n");
		System.out.println("Tipo da carne escolhida: " + tipy);
		System.out.println("Quantidade(kg) de escolha: " + kgQtd );
		System.out.println("Valor total da compra: " + total);
		System.out.println("Preferencia de pagamento: " + pag);
		System.out.println("Valor descontado: " + desconto);
		System.out.println("Valor total a pagar: " + valorTotal);
		System.out.println("---------------------------");
	}

}
