package br.com.fiap.view;

public class CharAtIndexLastIndexOf {

	public static void main(String[] args) {
		
		String descricao = new String("Maçã Gala, a maçã mais doce do mercado!");
		
		System.out.println(descricao.charAt(1));
		
		System.out.println(descricao.indexOf("G"));
		System.out.println(descricao.indexOf("Gala"));
		
		System.out.println(descricao.indexOf("a"));
		System.out.println(descricao.lastIndexOf("a"));

	}

}
