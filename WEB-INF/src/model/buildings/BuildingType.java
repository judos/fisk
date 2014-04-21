package model.buildings;

import model.Requirements;
import model.Ressources;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class BuildingType {

	protected Ressources defaultCost;
	protected int maxLevel;
	protected Requirements requirements;
	protected String name;

	public BuildingType(String name, Ressources cost, int maxLevel) {
		this.defaultCost = cost;
		this.requirements = new Requirements();
	}

	public BuildingType(String name, Ressources cost) {
		this(name, cost, Integer.MAX_VALUE);
	}

	public Ressources getDefaultCost() {
		return this.defaultCost;
	}

	public int getMaxLevel() {
		return this.maxLevel;
	}

	public Requirements getRequirements() {
		return this.requirements;
	}

	public String getName() {
		return this.name;
	}
}
