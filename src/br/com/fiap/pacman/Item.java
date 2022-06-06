package br.com.fiap.pacman;

public class Item extends GameObject {

	// ATTRIBUTES
	private boolean visible = true;

	// CONSTRUCTORS
	public Item() {
	}

	public Item(int x, int y) {
		super(x, y);
	}

	// GETS AND SETS
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
