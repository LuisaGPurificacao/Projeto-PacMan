package br.com.fiap.pacman;

public class Booster extends Item {

	// ATTRIBUTES
	private int time;

	// CONSTRUCTORS
	public Booster(int x, int y) {
			super(x, y);
		}

	public Booster() {
		}

	// GETS AND SETS
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
