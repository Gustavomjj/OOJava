package nelio.exercicios;

import java.util.Scanner;

public class triangulomain {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		triangulo x,y;
		y = new triangulo();
		x = new triangulo();
		
		
		System.out.println("Insira as medidas do triangulo X: ");
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();
		
		System.out.println("Insira as medidas do triangulo Y: ");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();
		
		double areaX = x.calcularArea();
		System.out.printf("Area do triangulo X é = %.4f%n", areaX);
		
		double areaY = y.calcularArea();
		System.out.printf("Area do triangulo Y é = %.4f%n", areaY);
		
		triangulo.maiorArea(areaX, areaY);
		
		
		entrada.close();
		
	}

}
