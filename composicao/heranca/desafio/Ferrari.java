package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	void acelerar(Carro carro) {
	velo += 15; 

	}
	
	void frear(Carro carro) {
		if (velo > 0) {
		velo -= 15;
		}
	}
}
