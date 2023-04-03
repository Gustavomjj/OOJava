package oo2.composicao2;

public class CompraTeste {
		
	public static void main(String[] args) {

		Compras c1 = new Compras();
		c1.adicionarItem(new Item("Tomate", 2, 2.25));
		c1.adicionarItem(new Item("Alho", 5, 1.69));
		c1.adicionarItem(new Item("Cebola", 3, 4.97));

		
		System.out.println(c1.obterValorTotal());
		
}
}
