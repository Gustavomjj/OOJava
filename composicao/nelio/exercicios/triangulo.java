package nelio.exercicios;

public class triangulo {
	
	double a;
	double b;
	double c;
	
	
	public double calcularArea() {
		double p = (a + b + c)/2;
		double area = Math.sqrt(p * (p - a)*(p - b)*(p - c));
		
		return area; 
	}
	
	  public static void maiorArea(double a, double b) {
		  if (a > b) {
			  System.out.println("O maior triangulo é o X.");
		  } else {
			  System.out.println("O maior triangulo é o Y.");
		  }
		  
	  }

}
