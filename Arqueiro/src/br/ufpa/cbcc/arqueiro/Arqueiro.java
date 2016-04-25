package br.ufpa.cbcc.arqueiro;

public abstract class Arqueiro extends Personagem implements Ataque {
	
	private int flechas;
	
	public Arqueiro() {
		super();
	}

	public Arqueiro(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida) {
		super(nome, dataBatalha, hp, sp, bemSucedida);
		this.flechas = 10;
	}
	
	public void setFlechas(int flechas){
		this.flechas = flechas;
	}

	public int getFlechas(){
		return flechas;
	}
	
	public void decFlechas(){
		--flechas;
	} 
	
	public void diminuirHp(int hp){
		--hp;
	}
	
	public void diminuirSp(int sp){
		--sp;
	}
	
	public void defesa(boolean bemSucedida){
		if(bemSucedida == false){
			diminuirHp(20);
			System.out.println("Defesa mal sucedida.");
		} else{
			System.out.println("Defesa bem sucedida.");
		}
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
	
	public void atacar(Inimigo inimigo){
		System.out.println("PEGA A FLECHA");
		decFlechas();
		System.out.println("ATIRANDO EM 3... 2... 1...");
		inimigo.diminuirHp();
	}
}
