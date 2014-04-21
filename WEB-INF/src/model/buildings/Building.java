package model.buildings;

import model.Ressources;

public class Building {

	protected BuildingType type;
	protected int level;

	public Building(BuildingType type) {
		this.type = type;
		this.level = 0;
	}

	public Ressources getCostsForNextLevel() {
		Ressources cost = this.type.getDefaultCost();
		cost.multiply(Math.pow(this.type.getCostFactor(), this.level));
		return cost;
	}

	public int getLevel() {
		return this.level;
	}

	public BuildingType getBuildingType() {
		return this.type;
	}

	public boolean isUpgradeable() {
		return this.level < this.type.getMaxLevel();
	}

	public void increaseLevel() {
		this.level++;
	}

}
