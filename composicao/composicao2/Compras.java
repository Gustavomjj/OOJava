package oo2.composicao2;

import java.util.ArrayList;

public class Compras {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	
	double obterValorTotal(){
		double total = 0;
		
		for (Item item: itens) {
			total += item.preco * item.quantidade;
		}
		
		return total;
	}
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compras = this;
	}
	
}
