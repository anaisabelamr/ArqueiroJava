package br.ufpa.cbcc.arqueiro;

import static br.ufpa.cbcc.arqueiro.Personagem.hpMax;
import static br.ufpa.cbcc.arqueiro.Personagem.spMax;

public abstract class Arqueiro extends Personagem implements Ataque {
	
	private int flechas;

	public Arqueiro(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida) {
		super(nome, dataBatalha, hp, sp, bemSucedida);
		this.flechas = flechas;
		
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
			diminuirHp();
			System.out.println("Defesa mal sucedida.");
		} else{
			System.out.println("Defesa bem sucedida.");
		}
	}
	
	public void furtividade(int hp, int sp, Personagem.hpMax, Personagem.spMax){
		while((this.sp <= spMax) && (this.hp <= hpMax)){
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
