package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		int respostas = 0;
		int regiao = 0;
		int contadorResN = 0;
		int contadorRes = 0;
		int contadorSul = 0;
		int contadorSudeste = 0;
		int contadorCentro = 0;
		int contadorNorte = 0;
		int contadorNordeste = 0;

		for (int i = 0; i < 100; i++) {

			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020? ");
			System.out.println("Digite 1 para SIM e 2 para NÃO");
			respostas = leitura.nextInt();
			System.out.println("Qual regiao do Brasil voce mora? 1-Sul 2-Sudeste 3-Centro-Oeste 4-Norte 5-Nordeste ");
			regiao = leitura.nextInt();
			if (respostas == 1) {
				contadorRes++;
			} else if (respostas == 2) {
				contadorResN++;
			}
			if (regiao == 1) {
				contadorSul++;
			} else if (regiao == 2) {
				contadorSudeste++;
			} else if (regiao == 3) {
				contadorCentro++;
			} else if (regiao == 4) {
				contadorNorte++;
			} else if (regiao == 5) {
				contadorNordeste++;
			}

		}
		System.out.println("Votos SIM: " + contadorRes);
		System.out.println("Votos NÃO: " + contadorResN);
		System.out.println("Pessoas do Sul: " + contadorSul);
		System.out.println("Pessoas do Sudeste: " + contadorSudeste);
		System.out.println("Pessoas do Centro-Oeste: " + contadorCentro);
		System.out.println("Pessoas do Norte: " + contadorNorte);
		System.out.println("Pessoas do Nordeste: " + contadorNordeste);
		leitura.close();
	}
}