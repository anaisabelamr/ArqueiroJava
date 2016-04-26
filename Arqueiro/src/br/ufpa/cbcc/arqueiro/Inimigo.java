package br.ufpa.cbcc.arqueiro;

public final class Inimigo extends Personagem {

	public Inimigo(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida) {
		super(nome, dataBatalha, hp, sp, bemSucedida);
	}
	
	public Inimigo(Inimigo copia){
		super((Personagem)copia);
	}

	public void diminuirHp(){
		hp=-5;
	}
	
	public void diminuirSp(int sp){
		sp=-5;
	}
	
	public void furtividade(int hp, int sp){
		while((this.sp < spMax) && (this.hp < hpMax)){
			System.out.println("MODO FURTIVO - DADOS DO PERSONAGEM");
			System.out.println("HP = "+ hp);
			System.out.println("SP = "+ sp);
			++hp;
			++sp;
		}
	}
	
	public void defesa(boolean bemSucedida){
		if(bemSucedida == false){
			diminuirHp();
			System.out.println("Defesa mal sucedida.");
		} else{
			System.out.println("Defesa bem sucedida.");
		}
	}
}
