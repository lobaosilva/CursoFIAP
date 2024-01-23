package com.java.operadores;

public class OperadorLogico {

	public static void main(String[] args) {
		
		// E ou AND (&&)
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar);
		
		// OU ou OR (||)
		int nrAmarelo = 2, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);
		
		// OU EXCLUSIVO (^)
		int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);
		
		// NÃO ou NOT (!)
		idade = 20;
		boolean maiorIdade = !(idade >= 18);
		System.out.println(maiorIdade);

	}

}
