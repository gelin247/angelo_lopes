package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		float maiorA = 0;
		float menorA = 1000000;
		float soma = 0;
		float contaA[] = new float[12];
		float maiorB = 0;
		float menorB = 1000000;
		float somaB = 0;
		float contaB[] = new float[12];

		for (int i = 0; i < 12; i++) {

			System.out.println("Digite o valor das contas do morador A");
			contaA[i] = leitura.nextFloat();

			soma += contaA[i];

			if (contaA[i] > maiorA) {
				maiorA = contaA[i];
			}

			if (contaA[i] < menorA) {
				menorA = contaA[i];
			}

		}

		System.out.println("A maior conta é: " + maiorA);
		System.out.println("A menor conta é: " + menorA);
		System.out.println("A média das contas é: " + soma / 12);

		for (int z = 0; z < 12; z++) {
			System.out.println("Digite o valor das contas do morador B");
			contaB[z] = leitura.nextFloat();

			somaB += contaB[z];

			if (contaB[z] > maiorB) {
				maiorB = contaB[z];
			}

			if (contaB[z] < menorB) {
				menorB = contaB[z];
			}

		}
		leitura.close();
		System.out.println("A maior conta é: " + maiorB);
		System.out.println("A menor conta é: " + menorB);
		System.out.println("A média das contas é: " + somaB / 12);

	}

}
