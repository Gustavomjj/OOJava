package nelio.exercicios;

import java.util.Scanner;

public class sistema {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product(); 
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		p1.name = sc.nextLine();
		
		System.out.println("Price:");
		p1.price = sc.nextDouble();
		
		System.out.println("Quantity in stock:");
		p1.quantity = sc.nextInt();
		
		System.out.printf("Product data: %s, $%.2f, %d units, Total: $ %.2f\n\n", p1.name, p1.price, p1.quantity,
				p1.totalValueInStock());
		
		System.out.println("Enter the number of products to be added in stock: ");
		p1.addProducts(sc.nextInt());
		
		System.out.printf("Product data: %s, $%.2f, %d units, Total: $ %.2f\n\n", p1.name, p1.price, p1.quantity,
				p1.totalValueInStock());
				
		System.out.println("Enter the number of products to be removed from stock: ");
		p1.removeProduct(sc.nextInt());
		
		System.out.printf("Product data: %s, $%.2f, %d units, Total: $ %.2f\n\n", p1.name, p1.price, p1.quantity,
				p1.totalValueInStock());
		
		
		
		
//		System.out.println(p1.totalValueInStock());
//		
//		p1.addProducts(5);
//		
//		System.out.println(p1.totalValueInStock());
//		
//		p1.removeProduct(5);
//		
//		System.out.println(p1.totalValueInStock());
	}

}
			