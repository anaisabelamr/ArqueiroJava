package br.ufpa.cbcc.arqueiro;

public final class Hunter extends Arqueiro implements Atributos {
	
	private int armadilha;
	
	public Hunter(){
		super();
		this.armadilha = 10;
	}
	
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
			diminuirHp(20);
			System.out.println("Defesa mal sucedida.");
		} else{
			System.out.println("Defesa bem sucedida.");
		}
	}
	
	public void furtividade(int sp, int hp){
		while((sp <= spMax) && (hp <= hpMax)){
			System.out.println("MODO FURTIVO - DADOS DO PERSONAGEM");
			System.out.println("HP = "+ hp);
			System.out.println("SP = "+ sp);
			hp+=4;
			sp+=4;
		}
		
	}
	
	public void atacar(Inimigo inimigo){
		System.out.println("SOLTANDO A ARMADILHA");
		decArmadilha();
		System.out.println("EXPLODINDO EM 3... 2... 1...");
		System.out.println("BUUUUUM");
		inimigo.diminuirHp();
	}
}
