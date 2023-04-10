package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.addItem("Televisão", 1000, 2);
		compra1.addItem("Notebook", 2400, 1);
		compra1.addItem("Som", 550, 3);

		Cliente c1 = new Cliente("Gustavo");
		c1.compras.add(compra1);
		c1.adicionarCompra(compra1);
		
		System.out.println(c1.obterValorTotal());
	}
}
