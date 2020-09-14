package br.edu.univas.main;

public class StartApp {
	public static void main(String args[]) {
		int resultado = somar(10, 20);
		int resultadoS = subtrair(20, 10);
		int resultadoM = multiplicar(20, 30);
		int resultadoD = dividir(30, 2);
		System.out.println(resultadoM);
		System.out.println(resultadoD);
		System.out.println(resultado);
		System.out.println(resultadoS);
	}

	public static int somar(int a, int b) {
		return a + b;

	}

	public static int multiplicar(int c, int d) {
		return c * d;
	}

	public static int dividir(int e, int f) {
		return e / f;
	}

	public static int subtrair(int g, int h) {
		return g - h;
	}
}