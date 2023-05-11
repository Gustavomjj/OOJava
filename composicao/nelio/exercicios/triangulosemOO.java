package nelio.exercicios;

import java.util.Scanner;

public class triangulosemOO {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Insira as medidas do triangulo X: ");
		xA = entrada.nextDouble();
		xB = entrada.nextDouble();
		xC = entrada.nextDouble();
		
		System.out.println("Insira as medidas do triangulo Y: ");
		yA = entrada.nextDouble();
		yB = entrada.nextDouble();
		yC = entrada.nextDouble();
		
		
		
		double px = (xA + xB + xC)/2;
		double areaX = Math.sqrt(px * (px - xA)*(px - xB)*(px - xC));
		
		double py = (yA + yB + yC)/2;
		double areaY = Math.sqrt(py * (py - yA)*(py - yB)*(py - yC));
		
		System.out.printf("A área do triangulo X é: %.4f \n", areaX);
		System.out.printf("A área do triangulo Y é: %.4f \n", areaY);
		
		String maior = ""; 
		
		if (areaX > areaY) {
			maior = "X";
		} else {
			maior = "Y";
		}
		
		System.out.println("O triangulo maior é o " + maior);
		
		
		entrada.close();
	}

}
