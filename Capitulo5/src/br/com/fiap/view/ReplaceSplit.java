package br.com.fiap.view;

import java.util.Arrays;

public class ReplaceSplit {

	public static void main(String[] args) {
		
		String descricao = new String("Maçã Gala,a maçã mais doce do mercado!");
		
		System.out.println(descricao.replace("G", "g"));
		System.out.println(descricao.replace("Gala", "Fuji"));
		System.out.println(descricao.replace("a", "A"));
		
		System.out.println(descricao.split(" ").length);
		System.out.println(Arrays.toString(descricao.split(" ")));
		
	}

}
