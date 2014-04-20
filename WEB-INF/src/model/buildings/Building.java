package model.buildings;

public class Building {

	protected int level;
	protected BuildingType type;

	public Building() {
		this.level = 0;
	}

	public void upgrade() {
		this.level++;
	}

	public int getLevel() {
		return this.level;
	}

}
