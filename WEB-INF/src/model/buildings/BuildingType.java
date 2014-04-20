package model.buildings;

import model.Ressources;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class BuildingType {

	protected Ressources defaultCost;
	protected int maxLevel;

	public BuildingType(Ressources cost, int maxLevel) {
		this.defaultCost = cost;
	}

	public BuildingType(Ressources cost) {
		new BuildingType(cost, Integer.MAX_VALUE);
	}

	public Ressources getDefaultCost() {
		return this.defaultCost;
	}

	public int getMaxLevel() {
		return this.maxLevel;
	}
}
