package br.ufpa.cbcc.arqueiro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		List <Arqueiro> arqueiros = new ArrayList <Arqueiro>();
		for(int i=0;i<4;i++){
			
			String opcao = JOptionPane.showInputDialog("DIGITE UM NUMERO, POR FAVORZINHO");
			
			if(opcao == null)
				System.exit(0);
			
			boolean sucesso = false;
			int opcaoFinal = 0;
			
			try {
				opcaoFinal = Integer.parseInt(opcao);
				sucesso = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "DIGITA UM NÚMERO");
			}
			
			if(sucesso){
				if(opcaoFinal == 1){
					Arqueiro arq = new Hunter();
					arqueiros.add(arq);
				}else if (opcaoFinal == 2){
					Arqueiro arq = new AtiradorDeElite();
					arqueiros.add(arq);
				}else
					i--;
			}else
				i--;
		}
		
		for (int i=0; i < arqueiros.size(); i++){
			
			if(arqueiros.get(i) instanceof Hunter){
				Hunter aux = (Hunter)arqueiros.get(i);
				aux.decArmadilha();
			}else if(arqueiros.get(i) instanceof AtiradorDeElite){
				AtiradorDeElite aux = (AtiradorDeElite)arqueiros.get(i);
				aux.decFlechaFogo();
			}
		}
	}

}
