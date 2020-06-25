package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		float numeros = 0;
		float counter = 0;
		System.out.println("Por favor, comece a digitar os numeros");
		System.out.println("Quando terminar digite 0 para fazer a contabilização dos impares");
		do {

			numeros = leitura.nextFloat();
			if (numeros < 0) {
				counter++;
			} else if (numeros == 0) {
				break;
			}

		} while (true);
		leitura.close();
		System.out.println("A quantidade de numeros impares é: " + counter);

	}

}
