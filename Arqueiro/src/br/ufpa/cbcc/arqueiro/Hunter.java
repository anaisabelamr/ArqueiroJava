package br.ufpa.cbcc.arqueiro;

public abstract class Hunter extends Arqueiro implements Ataque {
	
	private int armadilha;
	
	public Hunter(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida, int armadilha) {
		super(nome, dataBatalha, hp, sp, bemSucedida);
		this.armadilha = armadilha;
	}
	
	public void setArmadilha(int armadilha){
		this.armadilha = armadilha;
	}

	public int getArmadilha(){
		return armadilha;
	}
	
	public void decArmadilha(){
		--armadilha;
	}
	
	public void diminuirHp(int hp){
		hp=-2;
	}
	
	public void diminuirSp(int sp){
		sp=-2;
	}
	
	public void defesa(boolean bemSucedida){
		if(bemSucedida == false){
			diminuirHp();
			System.out.println("Defesa mal sucedida.");
		} else{
			System.out.println("Defesa bem sucedida.");
		}
	}
	
	public void furtividade(){
		while((sp <= spMax) && (hp <= hpMax)){
			System.out.println("MODO FURTIVO - DADOS DO PERSONAGEM");
			System.out.println("HP = "+ hp);
			System.out.println("SP = "+ sp);
			++hp;
			++sp;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
