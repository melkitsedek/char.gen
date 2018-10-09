package br.org.fatec.model;

public class CharacterAbility {
	private String ability;
	private short level;
	
	public CharacterAbility(String ability, short level) {
		this.ability = ability;
		this.level = level;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public short getLevel() {
		return level;
	}

	public void setLevel(short level) {
		this.level = level;
	}
	
	
}
