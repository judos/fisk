package model.buildings;

import model.Ressources;

public class Building {

	protected BuildingType type;
	protected Ressources defaultCost;

	public Building(BuildingType type, Ressources cost) {
		this.type = type;
		this.defaultCost = cost;
	}

	public Ressources getCostsForNextLevel(int level) {
		this.defaultCost.multiply(level);
		return this.defaultCost;
	}

	public BuildingType getBuildingType() {
		return this.type;
	}

}
