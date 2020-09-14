package br.edu.univas.main;

public class StartApp2 {
	public static void main(String[] args) {
		String[] alunosAprovados = new String[5];
		alunosAprovados[0] = "Angelo";
		alunosAprovados[1] = "João";
		alunosAprovados[2] = "Mario";
		alunosAprovados[3] = "ZÉ";
		alunosAprovados[4] = "Glay";
		imprimeNome(alunosAprovados, 0);
		// for (int i = 0; i < 5; i++) {
		// imprimeNome(alunosAprovados, i);
	}

	public static void imprimeNome(String[] alunos, int indice) {
		System.out.println(alunos[indice]);
		if (indice + 1 < alunos.length) {
			imprimeNome(alunos, ++indice);

		}
	}
}
