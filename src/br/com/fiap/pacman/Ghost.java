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
			if (newY < 0)
				return false;
		else if (direction == 90)
			newX = getX() + 10;
			if (newX < 0)
				return false;
		else if (direction == 180)
			newY = getY() + 10;
			if (newY > getScreenSize())
				return false;
		else if (direction == 270)
			newX = getX() - 10;
			if (newX > getScreenSize())
				return false;
			else
				return true;
	}

	public void move() {		
		direction = (int) (Math.round(Math.random()*3)*90);
		if (direction == 0)
			setY(getY() - 10);
		else if (direction == 90)
			setX(getX() + 10);
		else if (direction == 180)
			setY(getY() + 10);
		else if (direction == 270)
			setX(getX() - 10);
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
