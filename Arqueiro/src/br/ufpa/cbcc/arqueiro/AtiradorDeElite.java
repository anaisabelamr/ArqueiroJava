package br.ufpa.cbcc.arqueiro;

public abstract class AtiradorDeElite extends Arqueiro implements Ataque {
	
	public AtiradorDeElite(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida, int flechas) {
		super(nome,dataBatalha,hp,sp,bemSucedida);
		this.getFlechas();
		this.decFlechas();
	}

	public void diminuirHp(int hp){
		hp-=4;
	}
	
	public void diminuirSp(int sp){
		sp-=4;
	}
	
	public void furtividade(){
		
	}
	
	public void defesa(boolean bemSucedida){
		if(bemSucedida == false){
			diminuirHp();
			System.out.println("Defesa mal sucedida.");
		} else{
			System.out.println("Defesa bem sucedida.");
		}
	}
		
	public static void main(String[] args) {
		
	}

}
