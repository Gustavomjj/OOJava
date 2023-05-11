package nelio.exercicios;

public class Product {
	
	String name;
	double price;
	int quantity;
	
	double totalValueInStock() {
		double total = price * quantity;
		return total;
	}

	void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	
}
