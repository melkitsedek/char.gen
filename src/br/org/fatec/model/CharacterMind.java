package br.org.fatec.model;

public class CharacterMind {
	private Mindset primaryMindset, secondaryMindset, tertiaryMindset;

	public CharacterMind(Mindset primaryMindset, Mindset secondaryMindset, Mindset tertiaryMindset) {
		this.primaryMindset = primaryMindset;
		this.secondaryMindset = secondaryMindset;
		this.tertiaryMindset = tertiaryMindset;
	}

	public Mindset getPrimaryMindset() {
		return primaryMindset;
	}

	public void setPrimaryMindset(Mindset primaryMindset) {
		this.primaryMindset = primaryMindset;
	}

	public Mindset getSecondaryMindset() {
		return secondaryMindset;
	}

	public void setSecondaryMindset(Mindset secondaryMindset) {
		this.secondaryMindset = secondaryMindset;
	}

	public Mindset getTertiaryMindset() {
		return tertiaryMindset;
	}

	public void setTertiaryMindset(Mindset tertiaryMindset) {
		this.tertiaryMindset = tertiaryMindset;
	}
	
	
	
}
