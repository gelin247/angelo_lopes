package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		int numeros = 0;
		int numeroArredondado = 0;
		Scanner leitura = new Scanner(System.in);

		System.out.println("Por favor digite um numero para saber se será ou não arredondado");

		numeros = leitura.nextInt();

		if (numeros % 5 == 4) {
			numeroArredondado = numeros + 1;
			System.out.println("O numero " + numeros + " Arredondou para: " + numeroArredondado);

		} else if (numeros % 5 == 3) {
			numeroArredondado = numeros + 2;
			System.out.println("O numero " + numeros + " Arredondou para: " + numeroArredondado);
		} else {
			System.out.println("Impossivel arredondar o numero ");
		}
		leitura.close();

	}

}
