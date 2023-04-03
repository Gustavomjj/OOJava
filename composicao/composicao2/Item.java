package oo2.composicao2;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	
	Compras compras;
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
