package model.buildings;

import model.Ressources;

public class Building {

	protected BuildingType type;
	protected int level;
	protected int maxLevel;

	public Building(BuildingType type, Ressources cost, int maxLevel) {
		this.type = type;
		this.level = 0;
		this.maxLevel = maxLevel;
	}

	public Building(BuildingType type, Ressources cost) {
		new Building(type, cost, Integer.MAX_VALUE);
	}

	public Ressources getCostsForNextLevel() {
		Ressources cost = this.type.getDefaultCost();
		cost.multiply(this.level);
		return cost;
	}

	public int getLevel() {
		return this.level;
	}

	public BuildingType getBuildingType() {
		return this.type;
	}

	public boolean isUpgradeable() {
		return this.level < this.maxLevel;
	}

	public void increaseLevel() {
		this.level++;
	}

}
