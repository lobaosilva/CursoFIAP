package com.fiap.view;

import com.fiap.entity.Produto;

public class Caixa extends Produto {

	public static void main(String[] args) {
		
//		Produto[] produtos = new Produto[2];
		
//		Produto prod1 = new Produto();
//		prod1.setNome("Limão");
//		prod1.setDescricao("Galego");
//		prod1.setValor(4);
		
//		Produto prod2 = new Produto();
//		prod2.setNome("Maça");
//		prod2.setDescricao("Gala");
//		prod2.setValor(5);
		
//		produtos[0] = prod1;
//		produtos[1] = prod2;
		
//		for (int i = 0; i < produtos.length; i++) {
//			System.out.println(produtos[i].toString());
//		}
		
//		for (Produto prod:produtos) {
//			System.out.println(prod.toString());
//		}
		
		// 10 Corredores com três prateleiras cada
//		Produto[][] localizacaoProduto = new Produto[10][3];
		
//		localizacaoProduto[2][1] = prod1;
//		localizacaoProduto[2][2] = prod2;
		
//		System.out.println(localizacaoProduto[2][1].getNome());
		
//		String nome;
//		nome = new String();
//		nome = "Maçã";
//		System.out.println(nome);
		
//		String nome2 = new String("Maçã");
//		System.out.println(nome2);
		
//		String nome3 = "Maçã";
//		System.out.println(nome3);
		
//		String nome4 = null;
//		System.out.println(nome4.length());
		
//		String descricao = "Tipo Gala: \nA Maçã mais doce do mercado";
//		System.out.println(descricao);
		
//		descricao = "Tipo Gala: \tA mação mais doce do mercado";
//		System.out.println(descricao);
		
//		descricao = "Tipo Gala: \"A maçã mais doce do mercado\"";
//		System.out.println(descricao);
		
		String nome = new String("Maçã");
		String descricao = new String();
		descricao = "tipo Gala, a maça mais doce do mercado";
		
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda += "!";
		System.out.println(propaganda);

	}

}
