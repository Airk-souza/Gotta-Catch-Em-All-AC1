package Pokemons;

public class Pokemon {
	private String name;
	private int hpInicial;
	private int level;
	private Types type;
	private int attackPoints;
	private double defensePoints;
	private int hpFinal = hpInicial;
	
	


	public void setHpFinal(int hpFinal) {
		this.hpFinal = hpFinal;
	}
	public int getHpFinal() {
		return hpFinal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHpInicial() {
		return hpInicial;
	}


	public void setHpInicial(int hpInicial) {
		this.hpInicial = hpInicial;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public Types getType() {
		return type;
	}


	public void setType(Types type) {
		this.type = type;
	}


	public int getAttackPoints() {
		return attackPoints;
	}


	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}


	public double getDefensePoints() {
		return defensePoints;
	}


	public void setDefensePoints(double defensePoints) {
		this.defensePoints = defensePoints;
	}
	
	public void atacar(Pokemon alvo) {
		if(alvo.getHpFinal() > 0 && this.getHpFinal() >0) {
			alvo.setHpFinal(alvo.getHpFinal() - this.attackPoints);
		}else if (this.hpFinal >0 && alvo.hpFinal>=0) {
			System.out.println("Fim da Batalha voce venceu");
		}else if(this.hpFinal <= 0 && alvo.hpFinal >0) {
			System.out.println("Fim da batalaha voce foi derrotado");
		}

	}
}


	
