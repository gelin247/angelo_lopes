package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Por favor digite o primeiro valor");
		int primeiro = leitura.nextInt();
		System.out.println("Por favor digite o segundo valor");
		int segundo = leitura.nextInt();
		calculadora(primeiro, segundo);
		leitura.close();
	}

	public static void calculadora(int x, int y) {

		int resultado1 = somar(x, y);
		System.out.println(resultado1);
		int resultado2 = multiplicar(x, y);
		System.out.println(resultado2);
		int resultado3 = dividir(x, y);
		System.out.println(resultado3);
		int resultado4 = subtrair(x, y);
		System.out.println(resultado4);

	}

	public static int somar(int a, int b) {
		return a + b; 	 

	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static int dividir(int a, int b) {
		return a / b;
	}

	public static int subtrair(int a, int b) {
		return a - b;
	}
}
