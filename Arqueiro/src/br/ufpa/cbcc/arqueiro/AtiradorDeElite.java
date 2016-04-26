package br.ufpa.cbcc.arqueiro;

public final class AtiradorDeElite extends Arqueiro implements Atributos {
	
	private int flechaFogo;

	public AtiradorDeElite() {
		super();
		this.flechaFogo = 10;
	}
	
	public AtiradorDeElite(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida, int flechas) {
		super(nome,dataBatalha,hp,sp,bemSucedida);
		this.flechaFogo = flechas;
	}
	
	public int getFlechaFogo() {
		return flechaFogo;
	}

	public void setFlechaFogo(int flechaFogo) {
		this.flechaFogo = flechaFogo;
	}
	
	public void decFlechaFogo(){
		--flechaFogo;
	}

	public void diminuirHp(int hp){
		hp-=4;
	}
	
	public void diminuirSp(int sp){
		sp-=4;
	}
	
	public void furtividade(int hp, int sp){
		while((this.sp < spMax) && (this.hp < hpMax)){
			System.out.println("MODO FURTIVO - DADOS DO PERSONAGEM");
			System.out.println("HP = "+ hp);
			System.out.println("SP = "+ sp);
			hp+=2;
			sp+=2;
		}
	}
	
	public void defesa(boolean bemSucedida){
		if(bemSucedida == false){
			diminuirHp(20);
			System.out.println("Defesa mal sucedida.");
		} else{
			System.out.println("Defesa bem sucedida.");
		}
	}
	
	public void atacar(Inimigo inimigo){
		System.out.println("PEGANDO A FLECHA");
		System.out.println("ACENDENDO O FOGO");
		decFlechaFogo();
		System.out.println("ATIRANDO EM 3... 2... 1...");
		inimigo.diminuirHp();
	}
}
