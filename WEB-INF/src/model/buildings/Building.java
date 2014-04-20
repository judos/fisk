package model.buildings;

public class Building {

	protected int level;

	public Building() {
		this.level = 1;
	}

	public void upgrade() {
		this.level++;
	}

	public int getLevel() {
		return this.level;
	}

}
