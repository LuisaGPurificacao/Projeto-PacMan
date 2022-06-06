package br.com.fiap.pacman;

public class Bomb extends Item {

	// ATTRIBUTES
	private int removeLife;

	// CONSTRUCTORS
	public Bomb(int x, int y) {
		super(x, y);
	}

	public Bomb() {
	}

	// GETS AND SETS
	public int getRemoveLife() {
		return removeLife;
	}

	public void setRemoveLife(int removeLife) {
		this.removeLife = removeLife;
	}
	
}
