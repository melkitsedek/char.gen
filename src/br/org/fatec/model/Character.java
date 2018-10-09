package br.org.fatec.model;
import java.util.List;

public class Character {
	private String name;
	private Gender gender;
	private CharacterBody body;
	private CharacterMind mind;
	private CharacterHistory history;
	private List<CharacterAbility> abilities;
	
	public Character() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public CharacterBody getBody() {
		return body;
	}
	public void setBody(CharacterBody body) {
		this.body = body;
	}
	public CharacterMind getMind() {
		return mind;
	}
	public void setMind(CharacterMind mind) {
		this.mind = mind;
	}
	public CharacterHistory getHistory() {
		return history;
	}
	public void setHistory(CharacterHistory history) {
		this.history = history;
	}
	public List<CharacterAbility> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<CharacterAbility> abilities) {
		this.abilities = abilities;
	}
	
}
