package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Heroi j1 = new Heroi();
		j1.andar(Direcao.SUL);

		Monstro j2 = new Monstro();
		j2.andar(Direcao.OESTE);
		j2.andar(Direcao.SUL);
		
		System.out.println(j1.vida);
				
		System.out.println(j1.x);
		System.out.println(j1.y);
		
		System.out.println(j2.x);
		System.out.println(j2.y);
		
		j2.atacar(j1);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		
		
	}
	
}
