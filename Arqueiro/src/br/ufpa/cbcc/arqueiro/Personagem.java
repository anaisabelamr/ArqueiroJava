package br.ufpa.cbcc.arqueiro;

public abstract class Personagem {

		private String nome = "Oliver Queen";
		protected int hp = hpMax;
		protected int sp = spMax;
		private boolean bemSucedida;
		public final static int hpMax = 20;
		public final static int spMax = 10;
		
		public Personagem() {
			this.nome = "";
			this.hp = 20;
			this.sp = 10;
			this.bemSucedida = true;
		}
		public Personagem(String nome, Data dataBatalha, int hp, int sp, boolean bemSucedida){
			this.nome = nome;
			this.hp = hp;
			this.sp = sp;
			this.bemSucedida = bemSucedida;
		}
		
		public boolean isBemSucedida() {
			return bemSucedida;
		}
		
		public void setBemSucedida(boolean bemSucedida) {
			this.bemSucedida = bemSucedida;
		}
		
		public static int getHpmax() {
			return hpMax;
		}
		
		public static int getSpmax() {
			return spMax;
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

		public abstract void diminuirHp(int hp);
		
		public abstract void diminuirSp(int sp);
		
		public abstract void furtividade(int sp, int hp);
		
		public abstract void defesa(boolean bemSucedida);

}
