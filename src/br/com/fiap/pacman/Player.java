package br.com.fiap.pacman;

public class Player extends GameObject {

	// ATTRIBUTES
	private int direction;
	private int life;
	private boolean invincible;
	private int invincibleTime;

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
	public Player(int x, int y, int direction) {
		super(x, y);
		this.direction = direction;
	}

	public Player() {
	}

	// GETS AND SETS
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public boolean isInvincible() {
		return invincible;
	}

	public void setInvincible(boolean invincible) {
		this.invincible = invincible;
	}

	public int getInvincibleTime() {
		return invincibleTime;
	}

	public void setInvincibleTime(int invincibleTime) {
		this.invincibleTime = invincibleTime;
	}
}
