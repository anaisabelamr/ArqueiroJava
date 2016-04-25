package br.ufpa.cbcc.arqueiro;

public abstract class Inimigo extends Personagem {

	public Inimigo(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida) {
		super(nome, dataBatalha, hp, sp, bemSucedida);
		this.diminuirHp();
	}

	public void diminuirHp(int hp){
		hp=-5;
	}
}
