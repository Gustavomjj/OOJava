package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi();
		heroi.andar(Direcao.SUL);

		Monstro monstro = new Monstro();
		monstro.andar(Direcao.OESTE);
		monstro.andar(Direcao.SUL);
		
		System.out.println("Vida (heroi) = " + heroi.vida);
		System.out.println("Vida (monstro) = " + monstro.vida);
								
		monstro.atacar(heroi);
		
		System.out.println("Vida (heroi) = " + heroi.vida);
		System.out.println("Vida (monstro) = " + monstro.vida);
		
		heroi.atacar(monstro);

		System.out.println("Vida (heroi) = " + heroi.vida);
		System.out.println("Vida (monstro) = " + monstro.vida);
				
		monstro.andar(Direcao.NORTE);
		
		heroi.atacar(monstro);
		
		System.out.println("Vida (heroi) = " + heroi.vida);
		System.out.println("Vida (monstro) = " + monstro.vida);
		
		
		
		
	}
	
}
