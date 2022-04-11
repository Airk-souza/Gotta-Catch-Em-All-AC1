package Batalhas;

import java.util.Scanner;

//import java.util.Scanner;

import Pokemons.Bulbasaur;
import Pokemons.Charmander;
import Pokemons.Squirtle;

public class TestaPokemon {

	public static void main(String[] args) {
	
		Batalha batalha = null;
		Bulbasaur bulbasauro = new Bulbasaur();
		Charmander charmander = new Charmander();
		Squirtle squirtle = new Squirtle();
		
		
		System.out.println("Escolha um pokemon: ");
		System.out.println("[1]- Bulbasauro\n[2]- Squirtle\n[3]-Charmander\n");
		Scanner read = new Scanner(System.in);
		int escolhaPokemon = read.nextInt();
		
		
		switch (escolhaPokemon) {
		case 1:
			batalha = new Batalha(bulbasauro, charmander);
			break;
		case 2:
			batalha = new Batalha(squirtle, bulbasauro);
			break;
		case 3:
			batalha = new Batalha(charmander, squirtle);
			break;
		default:
			break;
		}
		
		System.out.println("A batalha se inicia!!!");
		batalha.iniciaBatalha();
		batalha.batalhar();		
		
		read.close();
//		System.out.println(squirtle.getHpInicial());
//		bulbasauro.atacar(squirtle);
//		System.out.println(squirtle.getHpFinal());
		
	}
}
