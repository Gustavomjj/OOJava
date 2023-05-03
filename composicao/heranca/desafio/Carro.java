package oo.heranca.desafio;

public class Carro {

	int velo = 0;
	
	void acelerar(Carro carro) {
		velo += 5; 
	}
	
	void frear(Carro carro) {
		if (velo > 0) {
		velo -= 5;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velo + "Km/h";
		
	}
	
	
}
