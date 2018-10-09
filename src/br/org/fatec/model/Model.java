package br.org.fatec.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.Characters;

public class Model {
	private static Model modelInstance;
	
	private static List<Character> characters;
	private static List<CharacterGroup> groups;
	
	private Model() {
		characters = new ArrayList<>();
		groups = new ArrayList<>();
		
	}
	
	public static Model getInstance() {
		if(modelInstance == null)
			modelInstance = new Model();
		return modelInstance;
	}
	
	public static void saveCharacter(Character c) {
		characters.add(c);
	}
	
	public static void saveGroup(CharacterGroup g) {
		groups.add(g);
	}

}
