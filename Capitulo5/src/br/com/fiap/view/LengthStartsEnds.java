package br.com.fiap.view;

public class LengthStartsEnds {

	public static void main(String[] args) {
		
		String descricao = new String("Maçã Gala, a maçã mais doce do mercado!");
		
		System.out.println(descricao.length());
		
		System.out.println(descricao.startsWith("Maçã"));
		System.out.println(descricao.endsWith("!"));

	}

}
