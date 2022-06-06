package br.com.fiap.pacman;

public class GameObject {

	// ATTRIBUTES
	private int X;
	private int Y;
	private int screenSize;

	// CONSTRUCTORS
	public GameObject() {
	}

	public GameObject(int X, int Y) {
		if (X >= 0)
			this.X = X;
		if (Y >= 0)
			this.Y = Y;
	}

	// GETS AND SETS
	public int getX() {
		return X;
	}

	public void setX(int x) {
		if (x >= 0)
			X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		if (y >= 0)
			Y = y;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		if (screenSize >= 0)
			this.screenSize = screenSize;
	}
}