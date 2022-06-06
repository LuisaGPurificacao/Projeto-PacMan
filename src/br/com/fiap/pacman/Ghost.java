package br.com.fiap.pacman;

public class Ghost extends GameObject {

	// ATTRIBUTES
	private int direction;

	// ACTION METHODS
	public boolean canMove() {
		int newY = getY();
		int newX = getX();

		if (direction == 0)
			newY = getY() - 10;
		else if (direction == 90)
			newX = getX() + 10;
		else if (direction == 180)
			newY = getY() + 10;
		else if (direction == 270)
			newX = getX() - 10;

		if (newY < 0 | newY > getScreenSize())
			return false;
		else if (newX < 0 | newX > getScreenSize())
			return false;
		else
			return true;
	}

	public void move() {
		if (direction == 0)
			setX(getX() - 10);
		else if (direction == 90)
			setY(getY() + 10);
		else if (direction == 180)
			setX(getX() + 10);
		else if (direction == 270)
			setY(getY() - 10);
	}

	// CONSTRUCTORS
	public Ghost(int x, int y, int direction) {
		super(x, y);
		this.direction = direction;
	}

	public Ghost() {
	}

	// GETS AND SETS
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

}
