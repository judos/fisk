package model.buildings;

import model.Requirement;
import model.Ressources;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class BuildingType {

	protected Ressources defaultCost;
	protected int maxLevel;
	protected Requirement requirements;

	public BuildingType(Ressources cost, int maxLevel) {
		this.defaultCost = cost;
		this.requirements = new Requirement();
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

	public Requirement getRequirements() {
		return this.requirements;
	}
}
