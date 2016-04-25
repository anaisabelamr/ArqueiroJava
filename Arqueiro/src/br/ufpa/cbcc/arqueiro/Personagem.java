package br.ufpa.cbcc.arqueiro;

public abstract class Personagem {

		private String nome = "Oliver Queen";
		private int hp = hpMax;
		private int sp = spMax;
		private boolean bemSucedida;
		private final static int hpMax = 20;
		private final static int spMax = 10;
		
		public Personagem() {
			this.nome = nome;
			this.hp = hp;
			this.sp = sp;
			this.bemSucedida = bemSucedida;
		}
		public Personagem(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida){
			this.nome = nome;
			this.hp = hp;
			this.sp = sp;
			this.bemSucedida = bemSucedida;
		}

		public String getNome(){
			return nome;
		}
		
		public void setNome(String nome){
			this.nome = nome;
		}
		
		public int getHp(){
			return hp;
		}
		
		public void setHp(int hp){
			this.hp = hp;
		}
		
		public int getSp(){
			return sp;
		}
		
		public void setSp(int sp){
			this.sp = sp;
		}
		
		public int getHpMax(){
			return hpMax;
		}

		public int getSpMax(){
			return spMax;
		}

		public abstract void diminuirHp();
		
		public abstract void diminuirSp();
		
		public abstract void furtividade();
		
		public abstract void defesa();

}
