package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
				
		Compra c1 = new Compra();
		c1.cliente = "Ricardo";
		c1.adicionarItem(new Item("Macarrão", 5, 2.99));
		c1.adicionarItem(new Item("Molho de tomate", 3, 5.78));
		c1.adicionarItem(new Item("Parmesão", 2, 3.45));
		
		
		System.out.println(c1.obterValorTotal());

	}
	
}
