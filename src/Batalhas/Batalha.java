package Batalhas;
import java.util.Scanner;

import Pokemons.*;

public class Batalha {
		private int menu;
		private Pokemon jogador;
		private Pokemon cPU;
		Scanner read = new Scanner(System.in);
		
			
		public Batalha(Pokemon jogador , Pokemon cPU ) {
				this.jogador = jogador;
				this.cPU = cPU;
		}
		
		public void iniciaBatalha() {
			System.out.println("====================================");
			System.out.println("Seu pokemon: "+ jogador.getName());
			System.out.println("Tipo: "+ jogador.getType());
			System.out.println("Seu adversário é: " + cPU.getName());
			System.out.println("Tipo:" + cPU.getType());
			System.out.println("====================================");
			
			getStatus();
			getStatusAdversario();
			
			
		}
		
		public void getStatus() {
			System.out.println("=====================");
			System.out.println(jogador.getName());
			if(jogador.getHpFinal() > 0) {
			System.out.println("HP: " + jogador.getHpFinal() + "/" +jogador.getHpInicial());
			}else if(jogador.getHpFinal()<= 0) {
				System.out.println("HP: 0 /" +jogador.getHpInicial());
			}
			System.out.println("Level: " + jogador.getLevel());
			System.out.println("=====================");
			
		}
		public void getStatusAdversario() {
			System.out.println("=====================");
			System.out.println("Adversário: " + cPU.getName());
			if(cPU.getHpFinal() >0) {
				System.out.println("HP: " + cPU.getHpFinal() + "/" +cPU.getHpInicial());
			}else if(cPU.getHpFinal()<=0) {
				System.out.println("HP: 0/" +cPU.getHpInicial());
			}
			System.out.println("Level: " + cPU.getLevel());
			System.out.println("=====================");
		}
		
		public void batalhar() {
			while(jogador.getHpFinal() >0  && cPU.getHpFinal() >0) {
				System.out.println("Atacar?");
				menu = read.nextInt();
				if(menu == 1) {
					System.out.println("Voce atacou!");
					jogador.atacar(cPU);
					getStatusAdversario();
					if (cPU.getHpFinal() <= 0) {
						System.out.println("Voce venceu!!!!");
						System.exit(0);
					}
				}
				
				if (jogador.getHpFinal() >0  && cPU.getHpFinal() >0) {
					System.out.println("Adversário atacou: ");
					cPU.atacar(jogador);
					getStatus();
					if (jogador.getHpFinal() <= 0) {
						System.out.println("Voce FOI DERROTADO!!!!");
						System.exit(0);
					}
				}
			}
			read.close();
		}	
}

