package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
	
	
	void acelerar() {
		if (motor.giros() < 7000)
		motor.fatorInjecao += 0.4;
	}


	void frear() {
		if (motor.giros() > 600) {
		motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.Ligado = true;
	}
	
	void  desligar() {
		motor.Ligado = false;
	}
	
	boolean estaLigado () {
		 return motor.Ligado;
	}
	
	
}
