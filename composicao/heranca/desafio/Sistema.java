package oo.heranca.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		 Civic c1 = new Civic();
		 c1.acelerar(c1);
		 c1.acelerar(c1);
		 c1.acelerar(c1);
		 c1.frear(c1);

		 System.out.println(c1);
		 
		 Ferrari c2 = new Ferrari();
		 c2.acelerar(c2);
		 c2.acelerar(c2);
		 c2.acelerar(c2);
		 c2.frear(c2);

		System.out.println(c2); 
		
		 
	}
			
}
